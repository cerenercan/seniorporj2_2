package com.project.model.venuesmodel;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private String headerFullLocation;
    private String query;
    private ArrayList<Groups> groups = new ArrayList<>();

}
