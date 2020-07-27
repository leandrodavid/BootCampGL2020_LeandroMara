package com.globallogic.ejercicioexcepciones;

/**
 * 
 *
 */
public class CapturaExceptionNull 
{
	static String cadena;
    public static void main( String[] args )
    {
    	try {
            System.out.println( cadena.toString() );
    	}catch (NullPointerException ex) {
    		System.out.println("Se produjo una excepción. " + ex.getMessage());
    	}
    }
}
