package com.github.courage007.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootLogApplication {
    public static void main(String[] args) {
        log.info("[SpringBootLogApplication] main -- begin");
        SpringApplication.run(SpringBootLogApplication.class, args);
        log.info("[SpringBootLogApplication] main -- end");
    }
}
