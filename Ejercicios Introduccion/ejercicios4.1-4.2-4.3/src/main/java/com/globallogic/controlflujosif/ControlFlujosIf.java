package com.globallogic.controlflujosif;

public class ControlFlujosIf {

	public static void main(String[] args) {
		
	   System.out.println("Ejercicio 4.1 ver el condicional if con enteros");
       SumaSuperiorA10 variableSuma=new SumaSuperiorA10();
       variableSuma.esMayorA10();
       
       System.out.println("Ejercicio 4.2 sobre letras mayusculas utilizando condicional if");
       MayusculaMinuscula varibleVerificarMayuscula= new MayusculaMinuscula();
       char charMayuscula='A';
       char charMinuscula='b';
       varibleVerificarMayuscula.esMayuscula(charMayuscula);
       varibleVerificarMayuscula.esMayuscula(charMinuscula);
      
       System.out.println("Ejercicio 4.3 sobre  condicional if multiple");
       DescuentosTienda variableDescuento= new DescuentosTienda();
       variableDescuento.verificarDescuento(400);
       
	}

}

//ejercicio4.1
class SumaSuperiorA10 {
	int numero1=3;
	int numero2=10;
	int suma = numero1 + numero2;
	
	public void esMayorA10() {
	  if(suma <= 10) 
		 System.out.println(" La suma de los numeros es : "+suma);
	  else
		  System.out.println(" La suma de los numeros es Mayor a 10"); 
	}
		
}

//ejercicio4.2
class MayusculaMinuscula {
		
	public void esMayuscula(char variable) {
		  
		if(Character.isUpperCase(variable)) 
			 System.out.println(variable+" Es una letra mayuscula");
		  else
			  System.out.println(variable+" No es una letra mayuscula"); 
		}
}

//ejercicio4.3
class DescuentosTienda {
	
	public void verificarDescuento(double valor) {
		if(valor > 350) 
			 System.out.println(" El descuento es de: "+valor *0.25);
		  else if(valor==300)
			  System.out.println(" El descuento es de: " +valor*0.20);
		  else
			  System.out.println(" Sin descuentos, el total es: "+ valor);
		}
	}
