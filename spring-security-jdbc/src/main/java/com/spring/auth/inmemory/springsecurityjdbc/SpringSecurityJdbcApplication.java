package com.spring.auth.inmemory.springsecurityjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringSecurityJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJdbcApplication.class, args);
    }


}
