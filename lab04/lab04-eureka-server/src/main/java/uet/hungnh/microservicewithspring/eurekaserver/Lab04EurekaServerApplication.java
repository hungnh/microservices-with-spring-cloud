package uet.hungnh.microservicewithspring.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab04EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab04EurekaServerApplication.class, args);
    }

}
