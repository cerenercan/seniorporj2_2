package com.project.service;

import com.project.client.RouteApiClient;
import com.project.configuration.properties.RouteApiProperties;
import com.project.model.routemodel.RouteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RouteService {

    private final RouteApiClient routeApiClient;
    private final RouteApiProperties routeApiProperties;

    public ResponseEntity<RouteResponse> getRoute(String waypoints, String mode) {
        return routeApiClient.getRoute(routeApiProperties.getKey(), waypoints, mode);
    }
}
