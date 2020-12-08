package com.project.service;

import com.project.client.WeatherApiClient;
import com.project.configuration.properties.WeatherApiProperties;
import com.project.model.forecastmodel.ForecastResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ForecastService {

    private final WeatherApiClient weatherApiClient;
    private final WeatherApiProperties weatherApiProperties;

    public ResponseEntity<ForecastResponse> getForecast(String countryName, int days){
        return weatherApiClient.getForecast(weatherApiProperties.getKey(), countryName, days);
    }
}
