package ar.edu.unlp.info.oo1.ParcialExcursiones;

public class Alquiler implements Elemento {
	private double costoXDia;
	private int cantDias;
	private String nombre;
	
	public Alquiler(double cxd, int cd, String n) {
		 this.costoXDia = cxd;
		 this.cantDias = cd;
		 this.nombre = n;
	}

	public int getCantDias() {
		return cantDias;
	}


	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}



	public double getCostoXDia() {
		return costoXDia;
	}



	public void setCostoXDia(double costoXDia) {
		this.costoXDia = costoXDia;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double calcularCosto() {
		return this.costoXDia * this.cantDias;
	}

}
