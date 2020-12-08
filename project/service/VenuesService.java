package com.project.service;

import com.project.client.VenuesApiClient;
import com.project.configuration.properties.VenuesApiProperties;
import com.project.model.venuesmodel.VenuesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VenuesService {

    private final VenuesApiClient venuesApiClient;
    private final VenuesApiProperties venuesApiProperties;

    public ResponseEntity<VenuesResponse> getVenues(String near, String query){
        return venuesApiClient.getVenues(near,query, venuesApiProperties.getClient_id(),
                venuesApiProperties.getClient_secret());
    }
}
