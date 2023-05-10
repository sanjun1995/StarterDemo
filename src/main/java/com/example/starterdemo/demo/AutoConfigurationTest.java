package com.example.starterdemo.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigurationTest {

    @Bean
    public ServiceBean getServiceBean() {
        return new ServiceBean();
    }
}