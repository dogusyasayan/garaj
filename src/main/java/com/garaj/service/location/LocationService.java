package com.garaj.service.location;

import com.garaj.model.response.location.LocationCompaniesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationService {


    public List<LocationCompaniesResponse> getLocationCompanies(Long userId) {
        return null;
    }
}
