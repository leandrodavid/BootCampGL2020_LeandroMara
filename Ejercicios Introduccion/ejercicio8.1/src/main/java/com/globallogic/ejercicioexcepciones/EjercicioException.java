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
        	throw new Exception("Esto es una Excepci�n");
        } catch (Exception ex) {
        	System.out.println("Se produjo una excepci�n: "+ex.getMessage());
        } finally {
        	System.out.println("Esto se ejecuta sin importar si se "+
        			"presentan errores");
        }
    }
}
