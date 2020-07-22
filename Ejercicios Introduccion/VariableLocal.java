package com.globallogic.app;

public class VariableLocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails estudiante = new StudentDetails();
		estudiante.studentAge();
		/*El ambiente de referenciamiento de la variable age es dentro
	      del metodo studentAge  */
		//System.out.println("La edad del estudiante es: " + age);
	}

}

class StudentDetails {
	public void studentAge() {
		int age=0;
		age= age + 5;
		System.out.println("La edad del estudiante es: " + age);
		
	}
}