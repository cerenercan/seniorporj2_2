package com.project.client;

import com.project.model.venuesmodel.VenuesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "venues-api", url = "${venues-api.url}")
public interface VenuesApiClient {

    @GetMapping("v2/venues/explore")
    ResponseEntity<VenuesResponse> getVenues(@RequestParam String near, @RequestParam String query,
    @RequestParam String client_id, @RequestParam String client_secret);
}

