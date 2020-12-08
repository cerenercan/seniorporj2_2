package com.project.client;

import com.project.model.forecastmodel.ForecastResponse;
import com.project.model.weathermodel.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "weather-api", url = "${weather-api.url}")
public interface WeatherApiClient {

    @GetMapping("/v1/current.json")
    ResponseEntity<WeatherResponse> getWeather(@RequestParam String key, @RequestParam String q);
    @GetMapping("/v1/forecast.json")
    ResponseEntity<ForecastResponse> getForecast(@RequestParam String key, @RequestParam String q, @RequestParam int days);

}