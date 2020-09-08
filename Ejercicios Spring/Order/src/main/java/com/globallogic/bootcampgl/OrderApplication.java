package com.globallogic.bootcampgl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderApplication {

	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrderApplication.class, args);
		OrderFactory a = context.getBean(OrderFactory.class);
		System.out.println(a.getNewOrder().toString());
		
	}
	

}
