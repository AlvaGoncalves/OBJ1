package ar.edu.unlp.info.oo1.ejercicio21_servicioDePaquetes;


public class Individuo extends Cliente {
	private int dni;
	
	public Individuo(String n, String d, int dni) {
		super(n, d);
		this.dni = dni;
		// TODO Auto-generated constructor stub
	}


	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}


	@Override
	public double montoAPagarConDescuento(double precio) {
		return precio - precio * 0.1;
	}
		
	
	
	
}
