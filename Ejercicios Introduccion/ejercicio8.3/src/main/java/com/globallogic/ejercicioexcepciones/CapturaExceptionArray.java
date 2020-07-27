package com.globallogic.ejercicioexcepciones;

/**
 * 
 *
 */
public class CapturaExceptionArray 
{
    public static void main( String[] args )
    {
    	int[] arreglo= new int[10];
    	try {
            arreglo[20]=1;
    	}catch (ArrayIndexOutOfBoundsException ex) {
    		System.out.println("Se produjo una excepción. " + ex.getMessage());
    	}
    }
}
