package com.project.model.forecastmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.model.weathermodel.Condition;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Day {

    @JsonProperty(value = "maxtemp_c")
    private Double maxTempCelcius;
    @JsonProperty(value = "mintemp_c")
    private Double minTempCelcius;
    @JsonProperty(value = "daily_chance_of_rain")
    private String rainPossibility;
    @JsonProperty(value = "daily_chance_of_snow")
    private String snowPossibility;
    private Condition condition;

}
