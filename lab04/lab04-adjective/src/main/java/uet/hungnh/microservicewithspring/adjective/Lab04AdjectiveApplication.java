package uet.hungnh.microservicewithspring.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab04AdjectiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab04AdjectiveApplication.class, args);
    }

}
