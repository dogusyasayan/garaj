package com.garaj.service.car;

import com.garaj.builder.car.CarBuilder;
import com.garaj.domain.car.Car;
import com.garaj.model.request.car.CreateCarRequest;
import com.garaj.repository.car.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarBuilder carBuilder;

    public void createCar(CreateCarRequest createCarRequest) {
        Car car = carBuilder.createCarBuilder(createCarRequest);
        carRepository.save(car);
    }
}

