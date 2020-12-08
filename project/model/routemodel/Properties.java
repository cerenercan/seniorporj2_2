package com.project.model.routemodel;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    private String mode;
    private int distance;
    private int time;
    private ArrayList<Legs> legs = new ArrayList<>();
}
