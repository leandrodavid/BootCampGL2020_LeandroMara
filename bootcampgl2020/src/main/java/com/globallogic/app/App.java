package com.globallogic.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Ejercicio 3.1 de datos primitivos ");
        TiposPrimitivos variableNum= new TiposPrimitivos();
        variableNum.main();
        System.out.println("Ejercicio 3.2 de primer variable ");
        PrimeraVariable variable= new PrimeraVariable();
        variable.main();
        System.out.println("Ejercicio 3.2 de primer variable ");
        PrimeraLista primerLista= new PrimeraLista();
        primerLista.main();
    }
}

class TiposPrimitivos{
	
	//Metodo para prueba de tipos de variables
	public void main(){
		int myNum =15;
		char myChar='a';
		boolean myBoolean= true;
		float myFloat= 24366.2456f;
		short myShort=500;
		System.out.println( myNum );
		System.out.println( myChar );
		System.out.println( myBoolean );
		System.out.println( myFloat );
		System.out.println( myShort );
				
	}
}



class PrimeraVariable{
	// Metodo para prueba de variable del tipo String
	public void main() {
		String mensaje;
		mensaje= "Valor inicial";
		System.out.println( mensaje );
		mensaje= "Valor modificado";
		System.out.println( mensaje );				
	}
}

class PrimeraLista{
	//Metodo para pruebas de listas
	public void main() {
		List<String> letters = new ArrayList<String>();	
		letters.add("A");
		letters.add("B");
		letters.add("C");
		for(String letter: letters) {
			System.out.println(letter);
		}
		
		System.out.println("La lista contiene "+letters.size()+ " elementos");
		
		letters.add(0,"X");
		
		for(String letter: letters) {
			System.out.println(letter);
		}
	}
	
}