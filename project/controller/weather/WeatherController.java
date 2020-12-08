package com.project.controller.weather;

import com.project.model.weathermodel.WeatherResponse;
import com.project.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/weather/country")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/{name}")
    public ResponseEntity<WeatherResponse> getWeather(@PathVariable String name) {
        return weatherService.getWeather(name);
    }



}
