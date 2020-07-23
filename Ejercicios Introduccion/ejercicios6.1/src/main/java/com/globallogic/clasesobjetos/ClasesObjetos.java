package com.globallogic.clasesobjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ClasesObjetos 
{
	static Scanner scanner = new Scanner(System.in);
	static List<Empleado> listaEmpleados= new ArrayList<Empleado>();
	
    public static void main( String[] args )
    {
        
        int cantPersona=cargarCantPersonas();
        for(int i=0;i<cantPersona;i++) {
        	cargarDatosEmpleado();
        }
        System.out.println("\n");
        System.out.println("Ingrese el valor de las hora extra ");
    	Empleado.setImportePorHora(scanner.nextInt());
        
        List<Empleado> listaAux=listaEmpleados;
        Collections.sort(listaAux, new OrdenarPorHorasExtras());
        Collections.sort(listaEmpleados, new OrdenarMenorSueldo());
        
        System.out.println("\n");
        System.out.println("El Empleado que menos cobra:");
        System.out.println(listaEmpleados.get(0).toString());
        
        System.out.println("\n");
        System.out.println("El Empleado que mas cobra:");
        System.out.println(listaEmpleados.get(listaEmpleados.size()-1).toString());
        
        System.out.println("\n");
        System.out.println("El Empleado que mas cobra por horas extras:");
        System.out.println(listaEmpleados.get(listaEmpleados.size()-1).toString());
        
        System.out.println("\n");
        System.out.println("El Empleado que menos cobra por horas extras :");
        System.out.println(listaEmpleados.get(0).toString());
        
        System.out.println("\n");
        System.out.println("El Empleado ordenados por menor sueldo :");
        for(Empleado emp: listaEmpleados) {
        	System.out.println(emp.toString());
        	
        }
    }
    
    public static int cargarCantPersonas() {
    	boolean listo=false;
    	int valor=0;
    	while (!listo) {
    		System.out.println("Ingrese la cantidad de Empleados no mayor a 20");
    		valor=scanner.nextInt();
    		if (valor<21)
    			listo=true;
    		else
    			System.out.println("Error a ingresar la cantidad");
    	}
    	return valor;
    }
    
    public static void cargarDatosEmpleado() {
    	Empleado empleado= new Empleado();
    	
    	System.out.println("\n");
    	System.out.println("Ingrese el Nombre del Empleado");
    	empleado.setNombre(scanner.next());
    	
    	System.out.println("\n");
    	System.out.println("Ingrese el Apellido del Empleado");
    	empleado.setApellido(scanner.next());
    	
    	System.out.println("\n");
    	System.out.println("Ingrese el ID del Empleado");
    	empleado.setId(scanner.next());
    	
    	System.out.println("\n");
    	System.out.println("Ingrese el sueldo base del Empleado");
    	empleado.setSueldoBase(scanner.nextDouble());
    	
    	System.out.println("\n");
    	System.out.println("Ingrese el las horas extras del Empleado");
    	empleado.setHorasExtrasMes(scanner.nextInt());
    	
    	System.out.println("\n");
    	System.out.println("Ingrese el tipo IRPF del Empleado");
    	empleado.setIrpf(scanner.nextDouble());
    	
    	System.out.println("\n");
    	System.out.println("Ingrese la cantidad de hijos del Empleado");
    	empleado.setCantHijos(scanner.nextInt());
    	  	
    	System.out.println("\n");
    	System.out.println("Ingrese S/s(si) o N/n(no) si el Empleado esta casado");
    	empleado.setCasado(scanner.next().charAt(0));
    	
    	listaEmpleados.add(empleado);
    }
    
    
    
}


class OrdenarMenorSueldo implements Comparator<Empleado> {


    @Override
    public int compare(Empleado e1, Empleado e2) {
        if ((e2.calcularSueldoBruto()-e2.calcularRetencionesIRPF()) < (e1.calcularSueldoBruto()-e1.calcularRetencionesIRPF()))
         {
             return 1;
         }
        else if ((e2.calcularSueldoBruto()-e2.calcularRetencionesIRPF()) > (e1.calcularSueldoBruto()-e1.calcularRetencionesIRPF()))
        {
            return -1;
        }
        return 0;    
    } 

}

class OrdenarPorHorasExtras implements Comparator<Empleado> {


    @Override
    public int compare(Empleado e1, Empleado e2) {
        if (e1.getHorasExtrasMes() < e2.getHorasExtrasMes())
         {
             return 1;
         }
        else if (e1.getHorasExtrasMes() > e2.getHorasExtrasMes())
        {
            return -1;
        }
        return 0;    
    } 

}




