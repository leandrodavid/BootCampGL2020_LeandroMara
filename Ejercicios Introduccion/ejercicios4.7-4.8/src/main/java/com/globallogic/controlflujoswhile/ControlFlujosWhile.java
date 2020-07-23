package com.globallogic.controlflujoswhile;

/**
 * Hello world!
 *
 */
public class ControlFlujosWhile 
{
    public static void main( String[] args )
    {
		System.out.println("Ejercicio 4.7 recorrido con while de 1 a 10");
		RecorridosConWhile instaciaPruebaWhile=new RecorridosConWhile();
		instaciaPruebaWhile.de1A10();
		System.out.println("Ejercicio 4.8 recorrido con while de 0 a 50 e imprimir par");
		instaciaPruebaWhile.parImpar();
	}

}

class RecorridosConWhile {
	
   //ejercicio 4.7	
   public void de1A10() {
		int i=1;
		while(i<11) {
			System.out.println("Valor iterado: "+i);
			i++;
		}
   }
   
   //ejercicio 4.8
   public void parImpar() {
		int i=1;
		while(i<=50) {
			if(i%2==0)
			    System.out.println("Valor iterado: "+i);
			i++;
		}
   }

}
