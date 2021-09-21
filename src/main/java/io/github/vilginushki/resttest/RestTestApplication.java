package io.github.vilginushki.resttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestTestApplication {
    //Only startup, as far as i understand we can also create here custom app config
    public static void main(String[] args) {
        SpringApplication.run(RestTestApplication.class, args);
    }

}
