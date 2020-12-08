package com.project.model.venuesmodel;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Groups {

    private ArrayList<Items> items = new ArrayList<>();

}
