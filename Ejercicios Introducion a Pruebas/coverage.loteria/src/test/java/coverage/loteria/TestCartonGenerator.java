package coverage.loteria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

class TestCartonGenerator {

	@Test
	void testCartonGenerator() {
		CartonGenerator instancia = new CartonGenerator();
		assertNotNull(instancia);
	}

	@Test
	void testIsGanador() {
		CartonGenerator instancia = new CartonGenerator();
		boolean ganador=instancia.isGanador();
	}

}
