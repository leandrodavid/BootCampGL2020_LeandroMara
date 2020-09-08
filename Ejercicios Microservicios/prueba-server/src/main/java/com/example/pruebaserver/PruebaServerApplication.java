package com.example.pruebaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PruebaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaServerApplication.class, args);
	}

}
