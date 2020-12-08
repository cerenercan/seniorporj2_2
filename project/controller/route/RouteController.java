package com.project.controller.route;

import com.project.model.routemodel.RouteResponse;
import com.project.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/route")
public class RouteController {

    private final RouteService routeService;

    @GetMapping("/{waypoint}/{mode}")
    public ResponseEntity<RouteResponse> getRoute(@PathVariable String waypoint, @PathVariable String mode){
        return routeService.getRoute(waypoint, mode);
    }
}
