package com.globallogic.bootcampgl.junitTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int sumar(int primerValor, int segundoValor) {
    	
    	return primerValor + segundoValor;
    }
    
    public static boolean bucle(int primerValor) {
    	
    	boolean salida = false;
    	for(int i= 0; i < primerValor; i++) {
    		if (i == 2) {
    			salida = true;
    			break;
    		}
    				
    	}
    	return salida;
    }
    
}
