package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import qoutes.obj.services.QoutesServices;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }

@Bean
public QoutesServices getQoutesServices(){
        return new QoutesServices();
}

}


