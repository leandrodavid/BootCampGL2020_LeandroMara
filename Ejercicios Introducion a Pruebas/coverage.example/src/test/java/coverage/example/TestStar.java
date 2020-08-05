package coverage.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;
import coverage.example.model.Star;

class TestStar {
    Star instancia;
	
	@Test
	void testGetName() {
		instancia = new Star();
		String esperado= "Tres Marias";
		instancia.setName(esperado);
		
		assertEquals(esperado, instancia.getName());
	}

	@Test
	void testSetName() {
		instancia = new Star();
		String esperado= "Tres Marias";
		instancia.setName(esperado);
		
		assertEquals(esperado, instancia.getName());
	}

	@Test
	void testGetColor() {
		instancia = new Star();
		String esperado= null;
		
		assertEquals(esperado, instancia.getColor());
	}

	@Test
	void testGetPlanets() {
		Planet planetaUno = new Planet();
		Planet planetaDos = new Planet();
		planetaUno.setName("Tierra");
		planetaDos.setName("Marte");
		List<Planet> planets = new ArrayList<>();
		planets.add(planetaUno);
		planets.add(planetaDos);
		Star instancia = new Star();
		instancia.setPlanets(planets);
		List<Planet> esperado= new ArrayList<Planet>(){{add(planetaUno); add(planetaDos);}};
		assertEquals(esperado, instancia.getPlanets());	
	}

	@Test
	void testSetPlanets() {
		Planet planetaUno = new Planet();
		Planet planetaDos = new Planet();
		planetaUno.setName("Tierra");
		planetaDos.setName("Marte");
		List<Planet> planets = new ArrayList<>();
		planets.add(planetaUno);
		planets.add(planetaDos);
		Star instancia = new Star();
		instancia.setPlanets(planets);
		List<Planet> esperado= new ArrayList<Planet>(){{add(planetaUno); add(planetaDos);}};
		assertEquals(esperado, instancia.getPlanets());	
		
	}

	@Test
	void testToString() {
		Planet planetaUno = new Planet();
		Planet planetaDos = new Planet();
		planetaUno.setName("Tierra");
		planetaDos.setName("Marte");
		List<Planet> planets = new ArrayList<>();
		planets.add(planetaUno);
		planets.add(planetaDos);
		Star instancia = new Star();
		instancia.setName("Las Tres Marias");
		instancia.setPlanets(planets);
		System.out.println(instancia.getPlanets());
		String esperado= "Star [name=Las Tres Marias, planets=[Planet [name=Tierra], Planet [name=Marte]]]";
		assertEquals(esperado, instancia.toString());
	}

}
