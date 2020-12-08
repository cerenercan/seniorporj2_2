package com.project.model.routemodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Steps {

    private Instruction instruction;
    @JsonProperty(value = "from_index")
    private int fromIndex;
    @JsonProperty(value = "to_index")
    private int toIndex;
    private int distance;
    private int time;




}
