package com.example.msexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableEurekaServer
public class MsexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsexampleApplication.class, args);
    }

}
