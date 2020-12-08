package com.project.model.weathermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Location {

    private String name;
    private String country;
    private Float lat;
    private Float lon;
    @JsonProperty(value = "localtime")
    private String localTime;
    private String region;
//    @JsonProperty(value = "tz_id")
//    private String timeZoneId;
//    @JsonProperty(value = "localtime_epoch")
//    private Long localTimeEpoch;
}
