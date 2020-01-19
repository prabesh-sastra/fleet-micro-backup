package sastra.p2s.fleetgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class FleetGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FleetGatewayApplication.class, args);
    }

}
