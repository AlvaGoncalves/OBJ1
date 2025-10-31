package ar.edu.unlp.info.oo1.ejercicio9_redAlumbrado;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Farola {
	private List<Farola> Vecinos = new ArrayList<Farola>();
	private boolean encendida;
	
	
	public Farola() {
		this.encendida = false;
		this.Vecinos = new ArrayList<Farola>();
	}
	
	public void pairWithNeightbor(Farola otraFarola) {
		if(!this.Vecinos.contains(otraFarola)) {
			this.Vecinos.add(otraFarola);
			otraFarola.pairWithNeightbor(otraFarola);
			
		}
	}
	
	
	public String getNombreCompleto() {
		return this.getApellido() + ", " + this.getNombre();
	}

}
