package com.globallogic.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        TiposPrimitivos variableNum= new TiposPrimitivos();
        variableNum.main();
    }
}

class TiposPrimitivos{
	//Metodo para prueba de tipos de variables
	void main(){
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
	void main() {
		String mensaje;
		mensaje= "Valor inicial";
		System.out.println( mensaje );
		mensaje= "Valor modificado";
		System.out.println( mensaje );				
	}
}

