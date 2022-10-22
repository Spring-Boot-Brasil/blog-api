package br.com.springbootbrasil.bases;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
public class BasesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasesApplication.class, args);
    }
}