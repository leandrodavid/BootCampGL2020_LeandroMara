package com.globallogic.studentdetails;

/**
 * Hello world!
 *
 */
public class StudentDetails 
{
    public static void main( String[] args )
    {
    	StudentDetails estudiante = new StudentDetails();
		estudiante.studentAge();
		estudiante.studentAgeModificado(10);
		

    }
    
	public void studentAge() {
		int age=0;
		age= age + 5;
		System.out.println("La edad del estudiante es: " + age);
		
	}
	public void studentAgeModificado(int nuevaEdad) {

		System.out.println("La edad del estudiante es: " + nuevaEdad);
		
	}

}
