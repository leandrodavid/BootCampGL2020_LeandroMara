package com.globallogic.empleadodemo;

/**
 * Hello world!
 *
 */
public class EmpleadoDemo 
{
    public static void main( String[] args )
    {
    	Empleado.salario=1000;
        //Reaizamos un cast (int) para que el salario se muestre como se pide en el ejercicio
        System.out.println(Empleado.nombre+" tiene un salario de "+ (int)Empleado.salario);

    }
}

class Empleado {
	static double salario;
	static String nombre ="Alex";
	
	
}