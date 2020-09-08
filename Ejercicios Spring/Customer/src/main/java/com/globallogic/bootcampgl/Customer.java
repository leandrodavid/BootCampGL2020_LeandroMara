package com.globallogic.bootcampgl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Customer implements CommandLineRunner{

	private String name = "Jose Perez";
	private Long dni = 234567890L;
	private Long id = 12342L;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Long getDni() {
		return dni;
	}



	public void setDni(Long dni) {
		this.dni = dni;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

    

	@Override
	public String toString() {
		return "Customer:\n    name:" + name + "\n   dni:" + dni + "\n   id:" + id;
	}



	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		System.out.println(customer.toString());		
	}
}
