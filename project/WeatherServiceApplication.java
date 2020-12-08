package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class WeatherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherServiceApplication.class, args);
    }
}

/*
10 tane turistik mekan seçilcek(point of interest)
-> kategorileştirebilirsin
lon ve lat'ları çekilmiş gibi setle
 */
