package com.garaj.service.brand;

import com.garaj.builder.brand.BrandBuilder;
import com.garaj.domain.brand.Brand;
import com.garaj.model.request.brand.CreateBrandRequest;
import com.garaj.repository.brand.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandService {

    private final BrandBuilder brandBuilder;

    private final BrandRepository brandRepository;

    public void createBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = brandBuilder.createBrandBuilder(createBrandRequest);
        brandRepository.save(brand);
    }
}
