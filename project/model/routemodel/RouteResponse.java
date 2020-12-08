package com.project.model.routemodel;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteResponse {

    private ArrayList<Features> features = new ArrayList<>();
}
