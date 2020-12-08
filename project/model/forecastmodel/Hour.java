package com.project.model.forecastmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.model.weathermodel.Condition;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hour {

    private String time;
    @JsonProperty(value = "temp_c")
    private Double tempCelcius;
    private Condition condition;
}
