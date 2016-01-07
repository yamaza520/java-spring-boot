package com.example.controller;

import com.example.entity.Task;
import com.example.service.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class TestController {

    @Autowired
    SampleService sampleService;

    @Value("${hello.value:World}")
    private String helloValue;

    @RequestMapping("/")
    String home() {
        return this.helloValue;
    }

    @RequestMapping("/calc")
    String calc() {
        return String.valueOf(sampleService.calcNum(1, 2));
    }

    @RequestMapping("/task")
    String task() {
        Page<Task> all = sampleService.getTaskAll();
        return all.getContent().get(0).toString();
    }

}
