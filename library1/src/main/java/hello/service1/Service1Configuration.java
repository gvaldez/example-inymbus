package hello.service1;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Service1Properties.class)
public class Service1Configuration {
    @Bean
    public Service1 service1(Service1Properties properties) {
        return new Service1(properties.getMessage());
    }
}
