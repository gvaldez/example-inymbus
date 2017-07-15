package hello.service1;

import org.springframework.stereotype.Component;

@Component
public class Service1 {

    private final String message;

    public Service1(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
