package com.project.service;

import com.project.client.WeatherApiClient;
import com.project.configuration.properties.WeatherApiProperties;
import com.project.model.weathermodel.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WeatherService {

    private final WeatherApiClient weatherApiClient;
    private final WeatherApiProperties weatherApiProperties;

    public ResponseEntity<WeatherResponse> getWeather(String countryName) {
        return weatherApiClient.getWeather(weatherApiProperties.getKey(), countryName);
    }
}
