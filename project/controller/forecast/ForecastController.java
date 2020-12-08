package com.project.controller.forecast;

import com.project.model.forecastmodel.ForecastResponse;
import com.project.service.ForecastService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/forecast/country")
public class ForecastController {

    private final ForecastService forecastService;

    @GetMapping("/{name}/{day}")
    public ResponseEntity<ForecastResponse> getForecast(@PathVariable String name, @PathVariable int day){
        return forecastService.getForecast(name, day);
    }

}
