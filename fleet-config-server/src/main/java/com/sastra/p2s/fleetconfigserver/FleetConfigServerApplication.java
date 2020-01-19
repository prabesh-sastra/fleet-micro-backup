package com.sastra.p2s.fleetconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableConfigServer
public class FleetConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FleetConfigServerApplication.class, args);
    }

}