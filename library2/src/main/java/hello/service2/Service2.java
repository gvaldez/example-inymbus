package hello.service2;

import org.springframework.stereotype.Component;

@Component
public class Service2 {

    private final String message;

    public Service2(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
