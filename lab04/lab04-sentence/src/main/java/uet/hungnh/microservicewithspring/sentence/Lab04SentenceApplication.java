package uet.hungnh.microservicewithspring.sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab04SentenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab04SentenceApplication.class, args);
    }

}
