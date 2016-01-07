package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {

    private static final Logger log = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/")
    String home() {
        log.debug("loglog");
        return "Greetings from Spring Boot!";
    }

}
