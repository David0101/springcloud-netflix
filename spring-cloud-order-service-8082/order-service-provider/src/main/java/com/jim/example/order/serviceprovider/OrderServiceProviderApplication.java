package com.jim.example.order.serviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceProviderApplication.class, args);
    }
}
