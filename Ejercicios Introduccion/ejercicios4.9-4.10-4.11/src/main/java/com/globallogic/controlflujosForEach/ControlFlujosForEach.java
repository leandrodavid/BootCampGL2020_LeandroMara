package com.globallogic.controlflujosForEach;

/**
 * Hello world!
 *
 */
public class ControlFlujosForEach 
{
    public static void main( String[] args )
    {
		RecorridosConForEach instaciaPruebaForEach=new RecorridosConForEach();
		System.out.println("Ejercicio 4.9 recorrido con foreach de 1 a 10 ");
		instaciaPruebaForEach.de1A10();
		System.out.println("Ejercicio 4.11 recorrido con foreach de la cadena BootCamp 2020 ");
		instaciaPruebaForEach.letraXLetra();
		System.out.println("Ejercicio 4.10 recorrido con foreach de dias de la semana ");
		instaciaPruebaForEach.diasDeLaSemana();
	}

}
class RecorridosConForEach {
	
	//ejercicio 4.9
	public void de1A10() {
		int[] arrayEnteros= {1,2,3,4,5,6,7,8,9,10};
		for(int num: arrayEnteros )
			System.out.println("Valor iterado: "+num);
	}
	
	//ejercicio 4.11
	public void letraXLetra() {
		String cadena="BootCamp 2020";
		char[] caracteres=cadena.toCharArray();
		
		for (char car: caracteres) 		
		   System.out.println("Letra: "+car);
	  
	}
	
	//ejercicio 4.10
	public void diasDeLaSemana() {
		String[] diasSemana=  {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		for(String dia: diasSemana)
			System.out.println("Dia de la semana: "+dia);
	}
	
}

