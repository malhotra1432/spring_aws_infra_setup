package com.spring_aws_infra_setup.spring_aws_infra_setup.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloWorldServiceTest {

    @InjectMocks
    private HelloWorldService helloWorldService;

    @Test
    void shouldGetGreetToWorld(){
        String expected = "Hello World!";
        String actual = helloWorldService.getGreetToWorld();
        assertThat(actual).isEqualTo(expected);
    }
}
