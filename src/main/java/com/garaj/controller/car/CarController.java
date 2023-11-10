package com.garaj.controller.car;

import com.garaj.model.request.car.CreateCarRequest;
import com.garaj.service.car.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping("/create-car")
    public void createCar(@RequestBody CreateCarRequest createCarRequest) {
        carService.createCar(createCarRequest);
    }
}
