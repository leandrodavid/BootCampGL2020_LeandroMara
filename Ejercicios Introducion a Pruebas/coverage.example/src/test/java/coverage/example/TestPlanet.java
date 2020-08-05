package coverage.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;

class TestPlanet {

	Planet instancia;

	

	@Test
	void testToString() {
		instancia = new Planet();
		instancia.setName("Jupiter");
		String esperado= "Planet [name=Jupiter]";
		assertEquals(esperado, instancia.toString());
		
	}

	@Test
	void testGetName() {
		instancia = new Planet();
		String esperado= "Jupiter";
		instancia.setName(esperado);
		
		assertEquals(esperado, instancia.getName());
	}

	@Test
	void testSetName() {
		instancia = new Planet();
		String esperado= "Jupiter";
		instancia.setName(esperado);
		
		assertEquals(esperado, instancia.getName());
	}

}
