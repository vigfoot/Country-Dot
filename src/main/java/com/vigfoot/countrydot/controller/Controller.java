package com.vigfoot.countrydot.controller;

import com.vigfoot.countrydot.vo.Location;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {



    @PostMapping("/location")
    public Mono<String> getLocationInfo(@ModelAttribute Location.Point point) {
        return Mono.empty();
    }
}
