package com.jk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource("classpath:spring-dubbo-provider.xml")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MyRabbitMQ  {

    public static void main(String[] args) {

        SpringApplication.run(MyRabbitMQ.class, args);
    }
}
