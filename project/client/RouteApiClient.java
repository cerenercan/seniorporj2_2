package com.project.client;

import com.project.model.routemodel.RouteResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "route-api", url = "${route-api.url}")
public interface RouteApiClient {

    @GetMapping("/v1/routing")
    ResponseEntity<RouteResponse> getRoute(@RequestParam String key, @RequestParam String wayPoints,
                                           @RequestParam String mode);
}
