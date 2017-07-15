package hello.service2;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service2")
public class Service2Properties {

    /**
     * A message for the service.
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
