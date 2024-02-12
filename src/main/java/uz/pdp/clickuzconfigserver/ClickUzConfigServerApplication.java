package uz.pdp.clickuzconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ClickUzConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClickUzConfigServerApplication.class, args);
    }

}
