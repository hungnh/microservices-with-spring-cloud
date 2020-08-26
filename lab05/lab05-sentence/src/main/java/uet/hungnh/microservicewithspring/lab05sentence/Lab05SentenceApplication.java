package uet.hungnh.microservicewithspring.lab05sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Lab05SentenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab05SentenceApplication.class, args);
    }

}
