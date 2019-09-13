package com.tf.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocTestController {

    @GetMapping
    public String pocHome() {
        return "POC Home";
    }
}
