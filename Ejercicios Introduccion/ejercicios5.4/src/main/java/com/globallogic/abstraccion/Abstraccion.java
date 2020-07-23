package com.globallogic.abstraccion;



/**
 * Hello world!
 *
 */
public class Abstraccion 
{
    public static void main( String[] args )
    {
		Automovil autoUno= new Berlina();
		autoUno.retoceder();
	}

}

abstract class Automovil {

    abstract void retoceder();

    void avanzar() {
        System.out.println("Soy el metodo avanzar de Automovil");
    }

}

class Berlina extends Automovil {
	
	@Override
	void retoceder() {
		System.out.println("Soy el metodo retroceder de Automovil");
		
	}
}