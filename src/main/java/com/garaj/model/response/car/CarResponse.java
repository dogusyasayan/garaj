package com.garaj.model.response.car;

import com.garaj.model.enums.CarType;
import com.garaj.model.enums.FuelType;
import com.garaj.model.enums.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarResponse {

    private TransmissionType transmissionType;

    private FuelType fuelType;

    private CarType carType;
}
