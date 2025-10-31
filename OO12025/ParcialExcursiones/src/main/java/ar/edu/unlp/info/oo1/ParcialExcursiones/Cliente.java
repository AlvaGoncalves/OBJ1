 package ar.edu.unlp.info.oo1.ParcialExcursiones;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
	private List<Presupuesto> presupuestos = new LinkedList<Presupuesto>();
	private String nombre;
	private int cuil;
	
	
	public Cliente() {
	}
	
	public Cliente(String n, int c) {
		this.cuil = c;
		this.nombre = n;
	}
	
	
	public double calcularDescuento() {
		double tot = 0;
		for(Presupuesto p : presupuestos) {
			tot =+ p.calcularTotalPresupuesto();	
		}
		if((presupuestos.size() >= 5) &&  (tot > 1000000)) { 
			aplicarDescuento(tot);
		}else System.out.println("Este cliente no goza de descuento");
		return tot;
	}
	
	private void aplicarDescuento(double tot) {
		tot = tot % 10;
	}


	public int getCuil() {
		return cuil;
	}


	public void setCuil(int cuil) {
		this.cuil = cuil;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}	
