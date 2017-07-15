package hello.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import hello.service2.Service2;
import hello.service2.Service2Configuration;

@RunWith(SpringRunner.class)
@SpringBootTest("service2.message=Hello")
public class Service2Test {

    @Autowired
    private Service2 service2;

    @Test
    public void contextLoads() {
        assertThat(service2.message()).isNotNull();
    }

    @SpringBootApplication
    @Import(Service2Configuration.class)
    static class TestConfiguration {
    }

}
