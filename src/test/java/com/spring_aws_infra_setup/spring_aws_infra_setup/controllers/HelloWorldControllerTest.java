package com.spring_aws_infra_setup.spring_aws_infra_setup.controllers;

import com.spring_aws_infra_setup.spring_aws_infra_setup.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.verify;

@SpringBootTest
class HelloWorldControllerTest {

    @Mock
    private HelloWorldService helloWorldService;

    @InjectMocks
    private HelloWorldController helloWorldController;

    @Test
    void shouldGreetToWorld(){
        helloWorldController.greetToWorld();
        verify(helloWorldService).getGreetToWorld();
    }

}
