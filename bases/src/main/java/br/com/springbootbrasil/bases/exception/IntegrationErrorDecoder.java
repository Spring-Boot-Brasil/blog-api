package br.com.springbootbrasil.bases.exception;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegrationErrorDecoder implements ErrorDecoder {

    private final Logger log = LoggerFactory.getLogger(IntegrationErrorDecoder.class);

    @Override
    public Exception decode(String methodKey, Response response) {
        log.error("Erro ao acessar recurso {} {} {} {}", methodKey, response.reason(), response.status(), response.request().url());
        return new Exception(String.format("Falha ao acessar %s %s", response.request().httpMethod(), response.request().url()));
    }
}

