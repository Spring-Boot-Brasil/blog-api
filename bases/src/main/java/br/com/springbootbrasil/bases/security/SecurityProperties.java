package br.com.springbootbrasil.bases.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
@ConfigurationProperties("base.security")
public class SecurityProperties {

    private List<RouteAllowed> routeAllowed;

    @Getter
    @Setter
    static class RouteAllowed {
        // GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
        private HttpMethod method;
        private String path;
    }

}
