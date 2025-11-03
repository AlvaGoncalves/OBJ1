package ar.edu.unlp.info.oo1.ejercicio21_servicioDePaquetes;


public class Corporativo extends Cliente {
	private int cuit;
	

	public Corporativo(String n, String d, int cuit) {
		super(n, d);
		this.cuit = cuit;
		// TODO Auto-generated constructor stub
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	@Override
	public double montoAPagarConDescuento(double precio) {
		// TODO Auto-generated method stub
		return precio;
	}

}
