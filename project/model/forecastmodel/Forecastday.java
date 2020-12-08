package com.project.model.forecastmodel;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Forecastday {

    private String date;
    private Day day;
    private ArrayList<Hour> hour = new ArrayList<>();


}
