package com.globallogic.ejercicioexcepciones;

public class MiExcepcion extends Exception {
    
	private String cadena ="Captura de la Excepción";
	public MiExcepcion() {		
	}
	@Override
	public String toString() {
		return cadena;
	}
	@Override
	public String getMessage() {
		return cadena;
	}
	
}
