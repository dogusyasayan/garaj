package com.garaj.service.car;

import com.garaj.converter.car.CarResponseConverter;
import com.garaj.domain.car.Car;
import com.garaj.model.response.car.CarResponse;
import com.garaj.repository.car.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    private final CarResponseConverter carResponseConverter;

    public CarResponse getCarResponse(Long carId) {
        Optional<Car> optionalCar = carRepository.findById(carId);
        if (optionalCar.isEmpty()) {
            return null;
        }
        Car car = optionalCar.get();
        return carResponseConverter.apply(car);
    }
}

