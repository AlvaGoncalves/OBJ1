package ar.edu.unlp.info.oo1.ParcialExcursiones;


import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*falta declarar la lista para comprobar si agrega y compara bien los valores con el tamaño,
 * mismo caso con ClienteTest, AlquilerTest.
 * Una vez definido, seguir comprobando la devolucion.
 */
public class ExcursionTest {

	Excursion disney, temaiken;
	
	@BeforeEach
	void setUp(){
		disney = new Excursion(2, 2, 2);
		temaiken = new Excursion(1, 1, 1);
		
	}
	
	@Test
	public void testCalcularCosto(){
		assertEquals(8, disney.calcularCosto());
		assertEquals(8, temaiken.calcularCosto());
	}
	
}
