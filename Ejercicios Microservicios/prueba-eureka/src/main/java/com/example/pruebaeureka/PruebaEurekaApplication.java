package com.example.pruebaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PruebaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaEurekaApplication.class, args);
	}

}
