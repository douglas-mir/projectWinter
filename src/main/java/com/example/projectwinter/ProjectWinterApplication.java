package com.example.projectwinter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjectWinterApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjectWinterApplication.class, args);
    }

}
