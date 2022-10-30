package br.com.springbootbrasil.newservice.config;


import br.com.springbootbrasil.bases.BaseIntegrationConfiguration;
import feign.RequestInterceptor;
import feign.okhttp.OkHttpClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Collections;
import java.util.List;

@Configuration
@Import(FeignClientsConfiguration.class)
public class IntegrationConfiguration extends BaseIntegrationConfiguration {

//    @Bean
//    public PaasClientAdapter pagamentoResource() {
//        return client(PaasClientAdapter.class, "https://paas-api.qbarato.app.br", Collections.emptyList());
//    }

    private <T> T client(Class<T> type, String url, List<RequestInterceptor> interceptors) {
        return createFeignBuilder()
                .client(new OkHttpClient())
                .requestInterceptors(interceptors)
                .target(type, url);
    }

}