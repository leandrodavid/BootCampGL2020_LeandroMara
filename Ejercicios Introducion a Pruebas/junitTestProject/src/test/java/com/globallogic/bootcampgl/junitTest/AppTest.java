package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class AppTest {

	

	@Test
	void test() {
		assertEquals("Test","Test");
	}
	
	
	//Ejercicio 1.2
	@Test
	void testVariablesString() {
		String stringVar1 = "Hola";
		String stringVar2 = "que";
		String stringVar3 = "tal";
		
		assertEquals(stringVar1,"Hola");
		assertEquals(stringVar2,"que");
		assertNotEquals(stringVar3,"chau");
		assertEquals(stringVar3.equals("chau"),false);
	}
	
	//Ejercicio 1.3
	@Test
	void testBoolean() {
		
		assertTrue(25 > 12);
		assertFalse(25 > 27);		
	}
	
	//Ejercicio 1.4
	@Test
	void testLong() {
		Long varPruebaLong = null;		
		assertNull(varPruebaLong);
		
		varPruebaLong = (long) 1;
		assertNotNull(varPruebaLong);
	}
	
	//Ejercicios comentados ya que son los que tenian que dar error
	
	//Ejercicio 1.5, Ejercicio 1.2 modificado
//		@Test
//		void testVariablesStringModificado() {
//			String stringVar1 = "Hola";
//			String stringVar2 = "que";
//			String stringVar3 = "tal";
//			
//			assertEquals(stringVar1,"que");
//			assertEquals(stringVar2,"Hola");
//			assertEquals(stringVar3.equals("tal"),false);
//		}
//		
//		//Ejercicio 1.5, Ejercicio 1.3 Modificado
//		@Test
//		void testBooleanModificado() {
//			
//			assertFalse(25 > 12);
//			assertTrue(25 > 27);		
//		}
//		
//		//Ejercicio 1.5, Ejercicio 1.4 modificado,  
//		@Test
//		void testLongModificado() {
//			Long varPruebaLong = null;		
//			assertNotNull(varPruebaLong);
//			
//			varPruebaLong = (long) 1;
//			assertNull(varPruebaLong);
//		}
	
	  //Ejercicio 1.6	
	  @Test
	  public void testSumar() {	  
	    assertEquals(3,App.sumar(1, 2),"El resultado está mal: ");	
	
	  }
	  
	//Ejercicio 1.7	
	  @Test
	  public void testBucle() {	  
		
		assertTrue(App.bucle(3),"Esta variable no es false:");	
		assertFalse(App.bucle(2),"Esta variable no es true:");  
		//Esto es lo que pide el ejercicio
//	    assertTrue(App.bucle(2),"Esta variable no es true:");	
//	    assertFalse(App.bucle(3),"Esta variable no es false:");
	  }
}


