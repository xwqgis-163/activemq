package com.test.acitvemq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ActiveMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActiveMqApplication.class, args);
        log.info("Application Start!");
    }
}
