package com.project.model.forecastmodel;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Forecast {

    private ArrayList<Forecastday> forecastday = new ArrayList<>();


}
