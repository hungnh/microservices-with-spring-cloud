package uet.hungnh.microservicewithspring.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab04SubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab04SubjectApplication.class, args);
    }

}
