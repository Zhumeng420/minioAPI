package com.example.minioapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class MinioApiApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MinioApiApplication.class, args);
        SpringApplication app = new SpringApplication(MinioApiApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);
        System.out.println("hello");
    }

}
