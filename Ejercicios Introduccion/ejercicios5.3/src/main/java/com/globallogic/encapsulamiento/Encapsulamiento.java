package com.globallogic.encapsulamiento;



/**
 * Hello world!
 *
 */
public class Encapsulamiento 
{
    public static void main( String[] args )
    {
    	Gato gatoUno= new Gato();
		gatoUno.setNombre("Garfield");
		gatoUno.setPatas(4);
		System.out.println("Me llamo "+ gatoUno.getNombre()+" y tengo "+
		+gatoUno.getPatas()+ " patas.");
	}

}
class Gato {

  private String nombre;
  private int patas;

  public String getNombre(){ 
	  return nombre;
  }

  public int getPatas(){ 
	  return patas;
  }

  public void setNombre(String nuevoNombre){ 
	  nombre = nuevoNombre;
  }

  public void setPatas(int numeroPatas){
	  patas = numeroPatas;
  }

}