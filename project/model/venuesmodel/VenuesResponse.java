package com.project.model.venuesmodel;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VenuesResponse {

    private Response response;
    private String  query;

}
