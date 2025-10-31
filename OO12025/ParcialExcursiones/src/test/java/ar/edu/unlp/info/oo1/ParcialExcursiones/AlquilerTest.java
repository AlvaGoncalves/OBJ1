package ar.edu.unlp.info.oo1.ParcialExcursiones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlquilerTest {

	Alquiler buzeo, escalado;
	
	@BeforeEach
	void setUp() {
		buzeo = new Alquiler(24, 1, "trajeBuzo1");
		escalado = new Alquiler(100, 4, "trajeEscalado2");
	}
	
	@Test
	public void testCalcularCosto() {
		assertEquals(24, buzeo.calcularCosto());
		assertEquals(400, escalado.calcularCosto());
	}
	
}
