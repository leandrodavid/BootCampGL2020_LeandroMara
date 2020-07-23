package com.globallogic.encapsulamiento;




public class Encapsulamiento 
{
    public static void main( String[] args )
    {
    	Gato gatoUno= new Gato();
		gatoUno.setNombre("Garfield");
		gatoUno.setPatas(4);
		System.out.println("Me llamo "+ gatoUno.getNombre()+" y tengo "+
		+gatoUno.getPatas()+ " patas.");
	}

}
