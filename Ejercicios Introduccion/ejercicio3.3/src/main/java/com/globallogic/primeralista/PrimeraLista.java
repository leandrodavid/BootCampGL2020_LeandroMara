package com.globallogic.primeralista;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class PrimeraLista 
{
    public static void main( String[] args )
    {
    	List<String> letters = new ArrayList<String>();	
		letters.add("A");
		letters.add("B");
		letters.add("C");
		for(String letter: letters) {
			System.out.println(letter);
		}
		
		System.out.println("La lista contiene "+letters.size()+ " elementos");
		
		letters.add(0,"X");
		
		for(String letter: letters) {
			System.out.println(letter);
		}

    }
}
