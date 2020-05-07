package com.infoworks.jaxws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.infoworks.jaxws.config", "com.infoworks.jaxws.components"})
public class SpringJaxWsServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringJaxWsServerApplication.class, args);
    }
}
