package com.globallogic.ejercicioexcepciones;

/**
 * 
 *
 */
public class EjercicioException 
{
    public static void main( String[] args )
    {
        try {
        	throw new Exception("Esto es una Excepción");
        } catch (Exception ex) {
        	System.out.println("Se produjo una excepción: "+ex.getMessage());
        } finally {
        	System.out.println("Esto se ejecuta sin importar si se "+
        			"presentan errores");
        }
    }
}
