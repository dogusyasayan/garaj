package com.garaj.converter.car;

import com.garaj.domain.car.Car;
import com.garaj.model.response.car.CarResponse;
import org.springframework.stereotype.Component;

@Component
public class CarResponseConverter {
    public CarResponse apply(Car car) {
        return CarResponse.builder()
                .carType(car.getCarType())
                .fuelType(car.getFuelType())
                .transmissionType(car.getTransmissionType())
                .build();
    }
}
