package com.garaj.repository.color;

import com.garaj.domain.brand.Brand;
import com.garaj.domain.color.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long>, JpaSpecificationExecutor<Color> {

    Optional<Color> findAllByColor(String color);
}
