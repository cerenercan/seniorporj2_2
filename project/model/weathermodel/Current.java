package com.project.model.weathermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.model.weathermodel.Condition;
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
public class Current {

    @JsonProperty(value = "last_updated")
    private String lastUpdated;
    @JsonProperty(value = "temp_c")
    private Double celsiusTemp;
    private Condition condition;
    private Double humidity;
    private Double cloud;
    @JsonProperty(value = "feelslike_c")
    private Double feelsLikeCelsius;
//    @JsonProperty(value = "last_updated_epoch")
//    private Long lastUpdatedEpoch;
//    @JsonProperty(value = "temp_f")
//    private Double fahrenheitTemp;
//    @JsonProperty(value = "is_day")
//    private Integer isDay;
//    @JsonProperty(value = "wind_mph")
//    private Double windMph;
//    @JsonProperty(value = "wind_kph")
//    private Double windKph;
//    @JsonProperty(value = "wind_degree")
//    private Double windDegree;
//    @JsonProperty(value = "wind_dir")
//    private String windDir;
//    @JsonProperty(value = "pressure_mb")
//    private Double pressureMb;
//    @JsonProperty(value = "pressure_in")
//    private Double pressureIn;
//    @JsonProperty(value = "precip_mm")
//    private Double precipMM;
//    @JsonProperty(value = "precip_in")
//    private Double precipIn;
//    @JsonProperty(value = "feelslike_f")
//    private Double feelsLikeFahrenheit;
//    @JsonProperty(value = "vis_km")
//    private Double visKm;
//    @JsonProperty(value = "vis_miles")
//    private Double visMiles;
//    private Double uv;
//    @JsonProperty(value = "gust_mph")
//    private Double gustMph;
//    @JsonProperty(value = "gust_kph")
//    private Double gustKph;
}
