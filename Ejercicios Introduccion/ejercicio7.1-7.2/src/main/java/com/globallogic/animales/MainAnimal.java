package com.globallogic.animales;


public class MainAnimal 
{
    public static void main( String[] args )
    {
    	String variable="perro";
        Perro dog=new Perro(variable);
        dog.sonidoAnimal();
        dog.dormir();
        dog.Come(variable);
        Animal.Camina(variable);
    }
}


