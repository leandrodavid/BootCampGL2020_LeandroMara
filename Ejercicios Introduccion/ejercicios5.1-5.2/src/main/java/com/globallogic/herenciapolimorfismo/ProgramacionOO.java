package com.globallogic.herenciapolimorfismo;

import java.util.ArrayList;
import java.util.List;



/**
 * Hello world!
 *
 */
public class ProgramacionOO 
{
    public static void main( String[] args )
    {
    	Electrodomestico electrodomesticoUno;
		Heladera heladeraUno;
		Cafetera cafeteraUno;
		Televisor televisorUno;
		
		electrodomesticoUno=new Electrodomestico("Sony", 24.5,'A',"Gris");
		heladeraUno = new Heladera("Gafa",39,'B',"Gris",300.5,true,66);
		televisorUno = new Televisor("Sanyo",30,'A',"Negro",50,"4K");
		cafeteraUno = new Cafetera("Oster",5,'A',"Rojo",2.5);
		
		//Ejercicio 5.1
		System.out.println("El electrodomestico es marca "+electrodomesticoUno.getMarca()+" tiene un peso de "+
		+electrodomesticoUno.getPeso()+ " consumo "+ electrodomesticoUno.getConsumo() +"  y su color es "+
		electrodomesticoUno.getColor());
	    electrodomesticoUno.encender();
	    
	    if (heladeraUno.isTieneFreezer()) {
	          System.out.println("La heladera es marca "+heladeraUno.getMarca()+" tiene un peso de "+
	          +heladeraUno.getPeso()+ " consumo "+ heladeraUno.getConsumo() +" y un color "+
	          heladeraUno.getColor()+" su capacidad es de "+heladeraUno.getCapacidad()+" Capacidad de Freezer " +heladeraUno.getCapacidadFreezer() );
	          }
	    else {
	    	  System.out.println("La heladera es  marca  "+heladeraUno.getMarca()+" tiene un peso de "+
	  	      +heladeraUno.getPeso()+ " consumo  "+ heladeraUno.getConsumo() +"y un color "+
	  	      heladeraUno.getColor()+" su capacidad es de "+heladeraUno.getCapacidad()+" No tiena  Freezer ");
	    	  }
	    
	    heladeraUno.encender();
	    
	    
	    //Ejercicio5.2 Crear una lista de Electrodomesticos
	    System.out.println("Creamos una lista de Electrodomesticos y los encendemos");
	    List<Electrodomestico> listaElectrodomesticos= new ArrayList<Electrodomestico>();
	    listaElectrodomesticos.add(heladeraUno);
	    listaElectrodomesticos.add(televisorUno);
	    listaElectrodomesticos.add(cafeteraUno);
	    
	    for(Electrodomestico elect: listaElectrodomesticos) {
	    	System.out.println("Encendiendo ");
	    	elect.encender();
	    }
	    
	}

	
	
}

class Electrodomestico {
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
class Heladera extends Electrodomestico {
	
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	
	public Heladera() {
	
	}
	
	public Heladera(String marca, double peso, char consumo, String color, double capacidad, boolean tieneFreezer,
			double capacidadFreezer) {
		super(marca, peso, consumo, color);
		this.capacidad = capacidad;
		this.tieneFreezer = tieneFreezer;
		this.capacidadFreezer = capacidadFreezer;
	}

	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isTieneFreezer() {
		return tieneFreezer;
	}
	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}
	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}
	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}
	
	public void guardarElemento(String variable) {
		System.out.println("Guardo el elemento: "+variable);
	}
	public void extraerElemento(String variable) {
		System.out.println("Extraigo el elemento: "+variable);
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo la Heladera");
		
	}
	
}

class Televisor extends Electrodomestico{
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

class Cafetera extends Electrodomestico{
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