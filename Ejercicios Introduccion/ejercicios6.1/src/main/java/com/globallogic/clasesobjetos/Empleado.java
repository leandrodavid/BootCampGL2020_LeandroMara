package com.globallogic.clasesobjetos;

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