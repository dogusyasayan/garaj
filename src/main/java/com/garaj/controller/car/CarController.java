package com.garaj.controller.car;

import com.garaj.model.response.car.CarResponse;
import com.garaj.service.car.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("{carId}")
    public CarResponse getCarResponse(@PathVariable Long carId) {
        return carService.getCarResponse(carId);
    }
}
