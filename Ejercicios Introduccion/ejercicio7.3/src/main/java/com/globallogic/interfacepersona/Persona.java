package com.globallogic.interfacepersona;

public interface Persona {
	
	public void hablar();
	
	public void dormir();
	
	public default void  come(String persona) {
		
		System.out.println(persona + " se alimenta");
	}
	

}
