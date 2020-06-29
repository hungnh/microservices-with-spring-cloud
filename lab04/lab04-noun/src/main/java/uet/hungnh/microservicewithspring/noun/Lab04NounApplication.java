package uet.hungnh.microservicewithspring.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab04NounApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab04NounApplication.class, args);
    }

}
