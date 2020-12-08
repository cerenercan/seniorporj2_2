package com.project.model.venuesmodel;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Venue {

    private String name;
    private Location location;
    private ArrayList<Categories> categories = new ArrayList<>();




}
