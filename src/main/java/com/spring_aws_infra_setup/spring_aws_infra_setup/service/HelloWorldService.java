package com.spring_aws_infra_setup.spring_aws_infra_setup.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getGreetToWorld() {
        return "Hello World!";
    }
}
