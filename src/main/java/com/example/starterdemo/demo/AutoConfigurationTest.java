package com.example.starterdemo.demo;

import com.example.starterdemo.anno.EnableAutoConfigTest;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(annotation = EnableAutoConfigTest.class)
public class AutoConfigurationTest {

    @Bean
    public ServiceBean getServiceBean() {
        return new ServiceBean();
    }
}