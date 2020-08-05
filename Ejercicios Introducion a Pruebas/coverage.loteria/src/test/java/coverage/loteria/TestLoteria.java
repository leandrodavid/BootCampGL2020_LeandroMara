package coverage.loteria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

class TestLoteria {

	static CartonGenerator cartonPrueba;
	
	@BeforeAll
	static void setup () {
		cartonPrueba = new CartonGenerator();
	}
	
	@Test
	void testLoteria() {
		
	}

	@Test
	void testGetPozo() {
		float esperado = 300000000;
		//CartonGenerator cartonPrueba = new CartonGenerator(); 
		Loteria instancia = new Loteria(300000000, 10, cartonPrueba);
		assertEquals(esperado, instancia.getPozo());
	}

	@Test
	void testGetBoletos() {
		float esperado = 10;
		//CartonGenerator cartonPrueba = new CartonGenerator(); 
		Loteria instancia = new Loteria(300000000, 10, cartonPrueba);
		assertEquals(esperado, instancia.getBoletos());
	}

	@Test
	void testGetGanadores() {
		int esperado = 0;
		//CartonGenerator cartonPrueba = new CartonGenerator(); 
		Loteria instancia = new Loteria(300000000, 10, cartonPrueba);
		assertEquals(esperado, instancia.getGanadores());
	}

	@Test
	void testJugada() {
		int esperado = 0;
		//CartonGenerator cartonPrueba = new CartonGenerator(); 
		Loteria instancia = new Loteria(300000000, 0, cartonPrueba);
		instancia.jugada();
		
		assertEquals(esperado, instancia.getGanadores());
	}

	@Test
	void testHayGanadorUnico() {
		//CartonGenerator cartonPrueba = new CartonGenerator(); 
		Loteria instancia = new Loteria(300000000, 0, cartonPrueba);
		instancia.jugada();
		
		assertFalse(instancia.hayGanadorUnico());
	}

	@Test
	void testHayCuadrupleGanador() {
		//CartonGenerator cartonPrueba = new CartonGenerator(); 
		Loteria instancia = new Loteria(300000000, 0, cartonPrueba);
		instancia.jugada();
		
		assertFalse(instancia.hayCuadrupleGanador());
	}

}
