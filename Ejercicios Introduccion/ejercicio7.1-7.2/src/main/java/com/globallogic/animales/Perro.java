package com.globallogic.animales;

class Perro implements Animal {

	private String nombre;
	
	
	public Perro() {
		
	}

	public Perro(String nombre) {
		this.nombre=nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void dormir() {
		System.out.println("Zzz");
		
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El "+this.nombre+ " hace guau guau");
		
	}
	
}
