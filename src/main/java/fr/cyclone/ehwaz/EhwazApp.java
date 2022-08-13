package fr.cyclone.ehwaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EhwazApp {
    public static void main(String[] args) {
        SpringApplication.run(EhwazApp.class, args);
    }
}
