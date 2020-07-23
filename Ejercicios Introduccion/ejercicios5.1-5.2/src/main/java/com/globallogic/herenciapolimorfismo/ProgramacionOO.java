package com.globallogic.herenciapolimorfismo;

import java.util.ArrayList;
import java.util.List;




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
		System.out.println("\n ");
		System.out.println("El electrodomestico es marca "+electrodomesticoUno.getMarca()+" tiene un peso de "+
		+electrodomesticoUno.getPeso()+ " consumo "+ electrodomesticoUno.getConsumo() +"  y su color es "+
		electrodomesticoUno.getColor());
	    electrodomesticoUno.encender();
	    
	    if (heladeraUno.isTieneFreezer()) {
	    	  System.out.println("\n ");
	          System.out.println("La heladera es marca "+heladeraUno.getMarca()+" tiene un peso de "+
	          +heladeraUno.getPeso()+ " consumo "+ heladeraUno.getConsumo() +" y un color "+
	          heladeraUno.getColor()+" su capacidad es de "+heladeraUno.getCapacidad()+" Capacidad de Freezer " +heladeraUno.getCapacidadFreezer() );
	          }
	    else {
	    	  System.out.println("\n ");
	    	  System.out.println("La heladera es  marca  "+heladeraUno.getMarca()+" tiene un peso de "+
	  	      +heladeraUno.getPeso()+ " consumo  "+ heladeraUno.getConsumo() +"y un color "+
	  	      heladeraUno.getColor()+" su capacidad es de "+heladeraUno.getCapacidad()+" No tiena  Freezer ");
	    	  }
	    
	    heladeraUno.encender();
	    
	    
	    //Ejercicio5.2 Crear una lista de Electrodomesticos
	    System.out.println("\n ");
	    System.out.println("Creamos una lista de Electrodomesticos y los encendemos");
	    List<Electrodomestico> listaElectrodomesticos= new ArrayList<Electrodomestico>();
	    listaElectrodomesticos.add(heladeraUno);
	    listaElectrodomesticos.add(televisorUno);
	    listaElectrodomesticos.add(cafeteraUno);
	    
	    for(Electrodomestico elect: listaElectrodomesticos) {
	    	System.out.println("\n ");
	    	elect.encender();
	    }
	    
	}

	
	
}




