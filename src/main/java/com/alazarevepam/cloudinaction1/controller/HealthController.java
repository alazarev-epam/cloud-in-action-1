package com.alazarevepam.cloudinaction1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping( value = "/health")
    public String health() {
        return "Health is OK";
    }
}
