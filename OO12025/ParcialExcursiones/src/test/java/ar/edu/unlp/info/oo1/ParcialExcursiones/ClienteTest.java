package ar.edu.unlp.info.oo1.ParcialExcursiones;

import static org.junit.jupiter.api.Assertions.assertEquals; 

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

	Cliente juan, pedro;
	
	@BeforeEach
	void setUp(){
		juan = new Cliente("juan", 11111);
		pedro = new Cliente("pedro", 22222);
	}
	
	@Test
	public void testCalcularDescuento() {
		
	}
	
	
}
