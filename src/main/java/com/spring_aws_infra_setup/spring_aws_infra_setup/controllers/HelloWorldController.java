package com.spring_aws_infra_setup.spring_aws_infra_setup.controllers;

import com.spring_aws_infra_setup.spring_aws_infra_setup.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/greet")
    public String greetToWorld() {
        return helloWorldService.getGreetToWorld();
    }
}
