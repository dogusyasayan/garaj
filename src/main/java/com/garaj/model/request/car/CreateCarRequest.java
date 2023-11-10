package com.garaj.model.request.car;

import com.garaj.model.enums.CarType;
import com.garaj.model.enums.FuelType;
import com.garaj.model.enums.TransmissionType;
import com.garaj.model.request.brand.CreateBrandRequest;
import com.garaj.model.request.color.CreateColorRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCarRequest implements Serializable {
    private TransmissionType transmissionType;
    private FuelType fuelType;
    private CarType carType;
    private Set<CreateColorRequest> color;
    private CreateBrandRequest brand;
}