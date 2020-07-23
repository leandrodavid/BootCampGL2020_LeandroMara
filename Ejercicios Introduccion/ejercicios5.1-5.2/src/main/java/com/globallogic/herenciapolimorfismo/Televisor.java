package com.globallogic.herenciapolimorfismo;

public class Televisor extends Electrodomestico{
	private double pulgadas;
	private String resolucion;
	
	
	public Televisor() {
		
	}
	
	public Televisor(String marca, double peso, char consumo, String color, double pulgadas, String resolucion) {
		super(marca, peso, consumo, color);
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}

	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	public void cambiarCanal(int canal) {
		System.out.println("Se esta cambiando al canal: "+canal);
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo el Televisor");
		
	}
}
