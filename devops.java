package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {

    @GetMapping("/")
    public String home() {
        return "Hello DevOps! Java app deployed successfully 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsApplication.class, args);
    }
}
