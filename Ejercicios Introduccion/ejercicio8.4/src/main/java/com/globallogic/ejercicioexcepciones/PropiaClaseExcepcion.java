package com.globallogic.ejercicioexcepciones;

/**
 * Hello world!
 *
 */
public class PropiaClaseExcepcion 
{
    public static void main( String[] args )
    {
    	try {
        	throw new MiExcepcion();
        } catch (MiExcepcion ex) {
        	System.out.println("Se produjo una excepción: "+ex.getMessage());
        }
    }
}
