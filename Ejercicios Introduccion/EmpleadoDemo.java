package com.globallogic.app;

public class EmpleadoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Empleado.salario=1000;
        //Reaizamos un cast (int) para que el salario se muestre como se pide en el ejercicio
        System.out.println(Empleado.nombre+" tiene un salario de "+ (int)Empleado.salario);
	}

}
//Ejercicio con variables de clase, se pueden hacer referencia sin ser instancia
class Empleado {
	static double salario;
	static String nombre ="Alex";
	
	
}