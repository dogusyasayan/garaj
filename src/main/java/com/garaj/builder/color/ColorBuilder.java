package com.garaj.builder.color;

import com.garaj.domain.color.Color;
import com.garaj.model.request.color.CreateColorRequest;
import org.springframework.stereotype.Component;

@Component
public class ColorBuilder {

    public Color createColorBuilder(CreateColorRequest createColorRequest) {
        return Color.builder()
                .color(createColorRequest.getColor())
                .build();
    }
}
