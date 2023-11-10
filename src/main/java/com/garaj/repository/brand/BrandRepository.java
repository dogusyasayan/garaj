package com.garaj.repository.brand;

import com.garaj.domain.brand.Brand;
import com.garaj.domain.car.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long>, JpaSpecificationExecutor<Car> {

    Optional<Brand> findAllByBrandName(String name);
}
