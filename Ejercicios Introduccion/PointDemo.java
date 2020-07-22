package com.globallogic.app;

public class PointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        VariableInstancia instancia= new VariableInstancia();
        instancia.engPoints=50;
        instancia.mathsPoints=80;
        System.out.println("engPoints:"+instancia.engPoints+" mathsPoints:"+
        + instancia.mathsPoints + " phyPoints:"+ instancia.phyPoints);
	}

}
// Ejercicio para probar variables de instancia
class VariableInstancia {
	int engPoints;
	int mathsPoints;
	int phyPoints;
	
	
}