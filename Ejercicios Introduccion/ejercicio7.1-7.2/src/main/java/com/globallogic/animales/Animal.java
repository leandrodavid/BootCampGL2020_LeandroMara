package com.globallogic.animales;

public interface Animal {
	public void dormir();
	public void sonidoAnimal();
	public default void Come(String animal) {
		System.out.println("El " + animal + " se alimenta");
	}
	public static void Camina(String animal) {
		System.out.println("El " + animal + " camina");
	}
	
}