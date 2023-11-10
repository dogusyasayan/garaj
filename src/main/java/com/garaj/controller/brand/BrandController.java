package com.garaj.controller.brand;

import com.garaj.model.request.brand.CreateBrandRequest;
import com.garaj.service.brand.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
@RequiredArgsConstructor
public class BrandController {

    private final BrandService brandService;

    @PostMapping("/create-brand")
    public void createBrand(CreateBrandRequest createBrandRequest) {
        brandService.createBrand(createBrandRequest);
    }
}
