package com.garaj.controller;

import com.garaj.model.request.color.CreateColorRequest;
import com.garaj.service.color.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
@RequiredArgsConstructor
public class ColorController {

    private final ColorService colorService;

    @PostMapping("/create-color")
    public void createColor(CreateColorRequest createColorRequest) {
        colorService.createColor(createColorRequest);
    }
}
