package com.globallogic.bootcamp.patterns;

public class Product {

	private String name = "Clavos";
	private static Product instancia = null;
	
	private Product() {
		
	}
	static Product getInstancia() {
		if(instancia == null) {
    		instancia = new Product();
    		return instancia;
    	}
    	return instancia;
    }
	public String getName() {
		return name;
	}
	
}
