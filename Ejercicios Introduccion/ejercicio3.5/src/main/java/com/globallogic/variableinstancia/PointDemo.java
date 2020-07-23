package com.globallogic.variableinstancia;

/**
 * Hello world!
 *
 */
public class PointDemo 
{
    public static void main( String[] args )
    {
       
    	VariableInstancia vi= new VariableInstancia();
        vi.engPoints=50;
        vi.mathsPoints=80;
        System.out.println("engPoints:"+vi.engPoints+" mathsPoints:"+
        + vi.mathsPoints + " phyPoints:"+ vi.phyPoints);

    	
    }
}

class VariableInstancia {
	int engPoints;
	int mathsPoints;
	int phyPoints;
	
	
}