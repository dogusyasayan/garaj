package com.garaj.builder.brand;

import com.garaj.domain.brand.Brand;
import com.garaj.domain.brand.CarModel;
import com.garaj.exception.BrandAlreadyExistException;
import com.garaj.model.request.brand.CreateBrandRequest;
import com.garaj.repository.brand.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BrandBuilder {

    private final BrandRepository brandRepository;

    public Brand createBrandBuilder(CreateBrandRequest createBrandRequest) {
        String brandName = createBrandRequest.getBrandName();
        Optional<Brand> existingBrand = brandRepository.findAllByBrandName(brandName);
        if (existingBrand.isPresent()) {
            throw new BrandAlreadyExistException(brandName);
        }
        return Brand.builder()
                .brandName(brandName)
                .build();
    }
}
