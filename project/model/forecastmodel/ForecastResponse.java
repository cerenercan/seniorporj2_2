package com.project.model.forecastmodel;

import com.project.model.weathermodel.Location;
import com.project.model.weathermodel.Current;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForecastResponse {

    private Location location;
    private Current current;
    private Forecast forecast;

}
