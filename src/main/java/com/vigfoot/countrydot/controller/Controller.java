package com.vigfoot.countrydot.controller;

import com.vigfoot.countrydot.vo.Geographic;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {



    @PostMapping("/location")
    public Mono<String> getLocationInfo(@ModelAttribute Geographic.Coordinate coordinate) {
        return Mono.empty();
    }
}
