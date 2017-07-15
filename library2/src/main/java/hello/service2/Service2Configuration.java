package hello.service2;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Service2Properties.class)
public class Service2Configuration {
    @Bean
    public Service2 service2(Service2Properties properties) {
        return new Service2(properties.getMessage());
    }
}
