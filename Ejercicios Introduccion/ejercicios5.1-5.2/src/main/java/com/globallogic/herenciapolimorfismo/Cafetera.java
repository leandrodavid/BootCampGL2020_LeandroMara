package com.globallogic.herenciapolimorfismo;

public class Cafetera extends Electrodomestico{
	private double litros;
	
	public Cafetera() {
		
	}

	public Cafetera(String marca, double peso, char consumo, String color, double litros) {
		super(marca, peso, consumo, color);
		this.litros = litros;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	public void elegirSabor(String sabor) {
		System.out.println("El sabor elegido es: "+ sabor);
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo la Cafetera");
		
	}
}