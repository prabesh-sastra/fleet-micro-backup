package sastra.p2s.fleet.registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FleetRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FleetRegistryServerApplication.class, args);
    }
}
