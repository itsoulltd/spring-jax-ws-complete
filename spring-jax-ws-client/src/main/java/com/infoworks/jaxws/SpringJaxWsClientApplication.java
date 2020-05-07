package com.infoworks.jaxws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.infoworks.jaxws.config", "com.infoworks.jaxws.runner"})
public class SpringJaxWsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJaxWsClientApplication.class, args);
	}

}
