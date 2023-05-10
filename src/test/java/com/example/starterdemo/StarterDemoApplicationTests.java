package com.example.starterdemo;

import com.example.starterdemo.demo.ServiceBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StarterDemoApplicationTests {

    @Autowired
    ServiceBean serviceBean;

    @Test
    void contextLoads() {
        System.out.println(serviceBean.sayHello("geek"));
    }
}
