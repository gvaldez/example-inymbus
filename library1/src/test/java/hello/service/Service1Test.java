package hello.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import hello.service1.Service1;
import hello.service1.Service1Configuration;

@RunWith(SpringRunner.class)
@SpringBootTest("service1.message=Hello")
public class Service1Test {

    @Autowired
    private Service1 service1;

    @Test
    public void contextLoads() {
        assertThat(service1.message()).isNotNull();
    }

    @SpringBootApplication
    @Import(Service1Configuration.class)
    static class TestConfiguration {
    }

}
