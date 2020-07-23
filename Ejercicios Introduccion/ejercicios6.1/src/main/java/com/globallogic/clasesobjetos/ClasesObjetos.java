package com.globallogic.clasesobjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
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
        System.out.println("Ingrese el valor de las hora extra ");
    	Empleado.setImportePorHora(scanner.nextInt());
        
        List<Empleado> listaAux=listaEmpleados;
        Collections.sort(listaAux, new OrdenarPorHorasExtras());
        Collections.sort(listaEmpleados, new OrdenarMenorSueldo());
        
        System.out.println("El Empleado que menos cobra:");
        System.out.println(listaEmpleados.get(0).toString());
        System.out.println("El Empleado que mas cobra:");
        System.out.println(listaEmpleados.get(listaEmpleados.size()-1).toString());
        System.out.println("El Empleado que mas cobra por horas extras:");
        System.out.println(listaEmpleados.get(listaEmpleados.size()-1).toString());
        System.out.println("El Empleado que menos cobra por horas extras :");
        System.out.println(listaEmpleados.get(0).toString());
        
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
    	System.out.println("Ingrese el Nombre del Empleado");
    	empleado.setNombre(scanner.next());
    	System.out.println("Ingrese el Apellido del Empleado");
    	empleado.setApellido(scanner.next());
    	System.out.println("Ingrese el ID del Empleado");
    	empleado.setId(scanner.next());
    	System.out.println("Ingrese el sueldo base del Empleado");
    	empleado.setSueldoBase(scanner.nextDouble());
    	System.out.println("Ingrese el las horas extras del Empleado");
    	empleado.setHorasExtrasMes(scanner.nextInt());
    	System.out.println("Ingrese el tipo IRPF del Empleado");
    	empleado.setIrpf(scanner.nextDouble());
    	System.out.println("Ingrese la cantidad de hijos del Empleado");
    	empleado.setCantHijos(scanner.nextInt());
    	empleado.setCasado(true);
    	listaEmpleados.add(empleado);
    }
    
    
    
}


class OrdenarMenorSueldo implements Comparator<Empleado> {


    @Override
    public int compare(Empleado e1, Empleado e2) {
        if (e2.calcularSueldoBruto() < e1.calcularSueldoBruto())
         {
             return 1;
         }
        else if (e2.calcularSueldoBruto() > e1.calcularSueldoBruto())
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

class  Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	
	public Persona() {
		
	}
	
	public Persona(int dni) {
		this.dni=dni;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public void saludar() {
		System.out.println("Hola!! soy "+ this.nombre);
	};
	
	
}


class Empleado extends Persona{
	private static int importePorHora;
	private String id;
	
	private double sueldoBase;
	private int horasExtrasMes;
	private double irpf; 
	private boolean casado;
	private int cantHijos;
	
	public Empleado() {
		
	}
	
	public Empleado(int dni) {
		super(dni);
	}
	
	public static int getImportePorHora() {
		return importePorHora;
	}


	public static void setImportePorHora(int importePorHora) {
		Empleado.importePorHora = importePorHora;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	


	public double getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	public int getHorasExtrasMes() {
		return horasExtrasMes;
	}


	public void setHorasExtrasMes(int horasExtrasMes) {
		this.horasExtrasMes = horasExtrasMes;
	}


	public double getIrpf() {
		return irpf;
	}


	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) {
		this.casado = casado;
	}


	public int getCantHijos() {
		return cantHijos;
	}


	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}


	@Override
	public void saludar() {
		
		System.out.println("Hola!! soy "+ this.getNombre());
	}
	
	public double calcularComplemento() {
		return this.getHorasExtrasMes()* importePorHora;
	}
	
	public double calcularSueldoBruto() {
		return this.getSueldoBase()+this.calcularComplemento();
	}
	
	public double calcularRetencionesIRPF() {
		double irpfAux=(this.getIrpf()-this.getCantHijos())*0.01;
		if (this.isCasado()) {
			return this.calcularSueldoBruto() * (irpfAux-0.02);
		}
		else
			return this.calcularSueldoBruto() * irpfAux;
	}

	@Override
	public String toString() {
		String casadoSN;
		if (this.isCasado())
			casadoSN="S";
		else
			casadoSN="N";
		
		return " "+ id + " "+ this.getNombre()+" "+this.getApellido()  + "\n sueldoBase:" + sueldoBase + "\n horasExtras:" + horasExtrasMes + "\n Tipo irpf:"
				+ irpf + "\n casado:" + casadoSN + "\n numero Hijos:" + cantHijos;
	}
	
	
}