package com.garaj.service.color;

import com.garaj.builder.color.ColorBuilder;
import com.garaj.domain.color.Color;
import com.garaj.exception.ColorAlreadyExistException;
import com.garaj.model.request.color.CreateColorRequest;
import com.garaj.repository.color.ColorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ColorService {

    private final ColorBuilder colorBuilder;

    private final ColorRepository colorRepository;

    public void createColor(CreateColorRequest createColorRequest) {
        Color color = colorBuilder.createColorBuilder(createColorRequest);
        Optional<Color> optionalColor = colorRepository.findAllByColor(color.getColor());
        if (optionalColor.isPresent()) {
            throw new ColorAlreadyExistException(color.getColor());
        }
        colorRepository.save(color);
    }
}

