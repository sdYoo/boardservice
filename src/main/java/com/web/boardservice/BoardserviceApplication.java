package com.web.boardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@Configuration
@SpringBootApplication
public class BoardserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardserviceApplication.class, args);
    }
}
