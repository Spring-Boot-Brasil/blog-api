package br.com.springbootbrasil.newservice.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {
        "br.com.springbootbrasil.domain",
        "br.com.springbootbrasil.newservice"
})
@EntityScan(basePackages = {
        "br.com.springbootbrasil.domain",
        "br.com.springbootbrasil.newservice"
})
@EnableJpaRepositories(basePackages = {
        "br.com.springbootbrasil.domain",
        "br.com.springbootbrasil.newservice"
})
@EnableTransactionManagement
@EnableJpaAuditing
public class RepositoryConfiguration {
}