package com.globallogic.controlflujosfor;

/**
 * Hello world!
 *
 */
public class ControlDeFlujosFor 
{
    public static void main( String[] args )
    {
    	
    	RecorridosConFor instaciaPruebaFor=new RecorridosConFor();
		instaciaPruebaFor.de1A10();
		instaciaPruebaFor.divisibleX20();
		instaciaPruebaFor.diasDeLaSemana();

        
    }
}

class RecorridosConFor {
	
	
	//ejercicio 4.4
	public void de1A10() {
		
		for(int i=1;i<11;i++)
			System.out.println("Valor iterado: "+i);
	}
	
	//ejercicio 4.5
	public void divisibleX20() {
		int cantidad=0;
		
		for (int i=0;i<=1000;i++) {
			if(i%20==0)
				cantidad++;
		}
		System.out.println("La cantidad de divisibles por 20 es: "+cantidad);
	}
	
	//ejercicio 4.6
	public void diasDeLaSemana() {
		String[] diasSemana=  {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		for(int i=0;i<diasSemana.length;i++)
			System.out.println("Dia de la semana: "+diasSemana[i]);
	}
	
}