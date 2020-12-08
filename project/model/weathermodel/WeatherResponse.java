package com.project.model.weathermodel;

import com.project.model.weathermodel.Current;
import com.project.model.weathermodel.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherResponse {

    private Location location;
    private Current current;
}
