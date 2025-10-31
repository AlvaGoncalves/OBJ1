package ar.edu.unlp.info.oo1.ParcialExcursiones;

import java.util.LinkedList;
import java.util.List;

public class Excursion implements Elemento {
	private double costoTraslado;
	private double costoGuia;
	private double valSeguro;
	private List<String> lugaresAVisitar = new LinkedList<String>();
	
	
	public Excursion(double costoT,double valS, double costoG) {
		this.costoGuia = costoG;
		this.costoTraslado = costoT;
		this.valSeguro = valS;
	}
	
	private double costoTotalGuia() {
		return costoGuia * this.lugaresAVisitar.size();
	}

	public double getCostoTraslado() {
		return costoTraslado;
	}


	public void setCostoTraslado(double costoTraslado) {
		this.costoTraslado = costoTraslado;
	}


	public double getCostoGuia() {
		return costoGuia;
	}


	public void setCostoGuia(double costoGuia) {
		this.costoGuia = costoGuia;
	}


	public List<String> getLugaresAVisitar() {
		return lugaresAVisitar;
	}


	public void setLugaresAVisitar(List<String> lugaresAVisitar) {
		this.lugaresAVisitar = lugaresAVisitar;
	}

	@Override
	public double calcularCosto() {
		return (costoTraslado + valSeguro + costoTotalGuia());
	}

}
