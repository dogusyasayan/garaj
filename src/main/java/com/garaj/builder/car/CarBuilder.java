package com.garaj.builder.car;

import com.garaj.builder.brand.BrandBuilder;
import com.garaj.builder.color.ColorBuilder;
import com.garaj.domain.brand.Brand;
import com.garaj.domain.car.Car;
import com.garaj.domain.car.CarStatus;
import com.garaj.domain.color.Color;
import com.garaj.model.enums.CarRentalOption;
import com.garaj.model.request.car.CreateCarRequest;
import com.garaj.model.request.color.CreateColorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CarBuilder {

    private final BrandBuilder brandBuilder;
    private final ColorBuilder colorBuilder;

    public Car createCarBuilder(CreateCarRequest createCarRequest) {
        Set<Color> colors = createColorSet(createCarRequest.getColor());
        Brand brand = brandBuilder.createBrandBuilder(createCarRequest.getBrand());

        CarStatus carStatus = new CarStatus();
        carStatus.setCarRentalOption(CarRentalOption.AVAILABLE);
        carStatus.setActive(true);

        HashSet<CarStatus> carStatuses = new HashSet<>();
        carStatuses.add(carStatus);

        return Car.builder()
                .transmissionType(createCarRequest.getTransmissionType())
                .carType(createCarRequest.getCarType())
                .fuelType(createCarRequest.getFuelType())
                .brand(brand)
                .colors(colors)
                .statuses(carStatuses)
                .build();
    }

    private Set<Color> createColorSet(Set<CreateColorRequest> colorRequests) {
        Set<Color> colors = new HashSet<>();

        for (CreateColorRequest colorRequest : colorRequests) {
            Color color = colorBuilder.createColorBuilder(colorRequest);
            colors.add(color);
        }
        return colors;
    }
}
