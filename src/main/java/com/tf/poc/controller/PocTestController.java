package com.tf.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocTestController {

    @GetMapping
    public String pocHome() {
       /* //creating divide by zero issue for sonarqube
        int line = 0;
        System.out.println(10/line);*/
        return "POC Home";
    }
}
