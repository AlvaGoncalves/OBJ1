package ar.edu.unlp.info.oo1.ejercicio21_servicioDePaquetes;

import java.time.LocalDate;
import java.util.Date;

public class Envio_Internacional extends Envio {

	public Envio_Internacional(String o, String d, LocalDate f, int p) {
		super(o, d, f, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularCosto() {
		double peso = this.getPeso();
		return peso <= 1000 ? (5000 + 10 * peso) : (5000 + 12 * peso);
	}

}
