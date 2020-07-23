package com.globallogic.herenciapolimorfismo;

public class Electrodomestico {
	private String marca;
	private double peso;
	private char consumo;
	private String color;
	
	
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(String marca, double peso, char consumo, String color) {
		
		this.marca = marca;
		this.peso = peso;
		this.consumo = consumo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getConsumo() {
		return consumo;
	}
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void encender() {
		System.out.println("Encendiendo el Electrodomestico");
	}
	public void apagar() {
		System.out.println("Apagando el Electrodomestico");
	}
}