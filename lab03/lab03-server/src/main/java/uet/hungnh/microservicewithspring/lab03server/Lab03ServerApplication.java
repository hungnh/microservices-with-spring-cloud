package uet.hungnh.microservicewithspring.lab03server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab03ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab03ServerApplication.class, args);
    }

}
