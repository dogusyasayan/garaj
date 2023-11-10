package com.garaj.model.response.location;

import com.garaj.model.enums.location.LocationOption;
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
public class LocationCompaniesResponse {

    private LocationOption locationOption;

}
