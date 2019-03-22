package com.kenny.springmav;

import config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmavApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[] {SpringmavApplication.class, JpaConfig.class}, args);
    }

}
