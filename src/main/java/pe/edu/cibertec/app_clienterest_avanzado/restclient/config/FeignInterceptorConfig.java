package pe.edu.cibertec.app_clienterest_avanzado.restclient.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignInterceptorConfig {
    //Este método añade el token para todas las peticiones
    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header("Authorization", "Bearer aqui_token");
            }
        };
    }
}
