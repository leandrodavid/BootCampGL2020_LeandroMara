package com.globallogic.bootcamp.patterns;

public class Currency {

	private String name;
	private static Currency currency=null;
	
	private  Currency() {		
		this.name = "ARS";
	}
    public Currency getInstncia() {
    	if(currency == null) {
    		currency = new Currency();
    		return currency;
    	}
    	return currency;
    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
