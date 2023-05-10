package com.example.starterdemo;

import com.example.starterdemo.anno.EnableAutoConfigTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfigTest
@SpringBootApplication
public class StarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterDemoApplication.class, args);
    }

}
