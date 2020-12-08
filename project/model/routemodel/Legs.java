package com.project.model.routemodel;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Legs {

    private ArrayList<Steps> steps = new ArrayList<>();
}
