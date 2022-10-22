package br.com.springbootbrasil.bases;

import br.com.springbootbrasil.bases.exception.IntegrationErrorDecoder;
import feign.*;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BaseIntegrationConfiguration {

    @Autowired
    private Decoder feignDecoder;

    @Autowired
    private Encoder feignEncoder;

    @Autowired
    private Contract feignContract;

    @Bean
    public IntegrationErrorDecoder feignErrorDecoder() {
        return new IntegrationErrorDecoder();
    }

    protected Feign.Builder createFeignBuilder() {
        return Feign.builder()
                .encoder(feignEncoder)
                .decoder(feignDecoder)
                .contract(feignContract)
                .errorDecoder(feignErrorDecoder())
                .retryer(Retryer.NEVER_RETRY)
                .options(new Request.Options(2, TimeUnit.MINUTES, 2, TimeUnit.MINUTES, false));
    }

    protected <T> T createRestClient(Class<T> type, String url, Function<Feign.Builder, Feign.Builder> configurer) {
        return configurer.apply(createFeignBuilder()).target(type, url);
    }

    protected <T> T createRestClient(Class<T> type, String baseUrl, String endpointUrl) {
        return createRestClient(type, baseUrl + endpointUrl, v -> v);
    }

    protected <T> T createRestClient(Class<T> type, String url) {
        return createRestClient(type, url, v -> v);
    }

    protected <T> T createRestClient(Class<T> type, String url, RequestInterceptor requestInterceptor) {
        return createRestClient(
                type,
                url, it -> {
                    it.requestInterceptor(requestInterceptor);
                    return it;
                });
    }

}
