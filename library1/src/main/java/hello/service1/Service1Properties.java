package hello.service1;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service1")
public class Service1Properties {

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
