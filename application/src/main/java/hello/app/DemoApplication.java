package hello.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.service1.Service1;
import hello.service1.Service1Configuration;

import hello.service2.Service2;
import hello.service2.Service2Configuration;

@SpringBootApplication
@Import({Service1Configuration.class, Service2Configuration.class})
@RestController
public class DemoApplication {

    private final Service2 service2;
    private final Service1 service1;


    @Autowired
    public DemoApplication(Service1 service1, Service2 service2) {
        this.service2 = service2;
        this.service1 = service1;
    }

    @GetMapping("/")
    public String home() {
        return "hi";
    }
    
    @GetMapping("/1")
    public String service1() {
        return service1.message();
    }

    @GetMapping("/2")
    public String service2() {
        return service2.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
