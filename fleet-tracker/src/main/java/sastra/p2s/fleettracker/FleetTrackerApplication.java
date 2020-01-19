package sastra.p2s.fleettracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FleetTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FleetTrackerApplication.class, args);
    }


    @RestController
    @RequestMapping
    public class Test{

        @GetMapping("/test")
        public String test(){
            return "tracker service";
        }
    }

}
