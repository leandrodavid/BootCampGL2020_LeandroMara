package com.globallogic.interfacepersona;

/**
 * 
 *
 */
public class Hombre implements Persona, Animal
{
    public static void main( String[] args )
    {
       
    	Hombre hombre= new Hombre();
    	hombre.dormir();
    	hombre.hablar();
    	hombre.sonidoAnimal();
    	Hombre.ejecutar();
    }

	@Override
	public void sonidoAnimal() {		
		System.out.println("El hombre no hace sonido de animal" );
		
	}

	

	@Override
	public void hablar() {
		System.out.println("Las personas hablan mucho");
		
	}

	@Override
	public void dormir() {
		System.out.println("El hombre duerme mucho");
		
	}

	public static void ejecutar() {
		
		System.out.println("Se ejecuta método de la clase Hombre" );
	}
	
    
    
}
