package com.bdoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayBackendApplication.class, args);
    }

}
