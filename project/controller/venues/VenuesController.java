package com.project.controller.venues;

import com.project.model.venuesmodel.VenuesResponse;
import com.project.service.VenuesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/venues/explore")
public class VenuesController {

    private final VenuesService venuesService;

    @GetMapping("/{near}/{query}")
    public ResponseEntity<VenuesResponse> getVenues(@PathVariable String near,
                                                    @PathVariable String query) {
        return venuesService.getVenues(near,query);
    }
}
