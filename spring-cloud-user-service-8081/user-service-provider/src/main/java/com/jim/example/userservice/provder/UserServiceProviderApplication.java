package com.jim.example.userservice.provder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication springApplication =  new SpringApplication(UserServiceProviderApplication.class);

        springApplication.run(args);
    }
}
