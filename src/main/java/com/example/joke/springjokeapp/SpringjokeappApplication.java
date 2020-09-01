package com.example.joke.springjokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringjokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjokeappApplication.class, args);
    }

}
