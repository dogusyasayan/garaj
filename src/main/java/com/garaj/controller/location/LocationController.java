package com.garaj.controller.location;

import com.garaj.model.response.location.LocationCompaniesResponse;
import com.garaj.service.location.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @GetMapping("/get-companies/{userId}")
    public List<LocationCompaniesResponse> getLocationCompanies(@PathVariable Long userId) {
        return locationService.getLocationCompanies(userId);
    }
}
