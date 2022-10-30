package br.com.springbootbrasil.newservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {
        "br.com.springbootbrasil.bases",
        "br.com.springbootbrasil.domain"
})
@ComponentScan(basePackages = {
        "br.com.springbootbrasil.bases",
        "br.com.springbootbrasil.domain",
        "br.com.springbootbrasil.newservice"
})
public class NewsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewsServiceApplication.class, args);
    }
}