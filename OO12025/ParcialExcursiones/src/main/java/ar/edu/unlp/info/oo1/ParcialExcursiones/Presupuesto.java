package ar.edu.unlp.info.oo1.ParcialExcursiones;

import java.util.LinkedList;
import java.util.List;

public class Presupuesto {
	private List<Elemento> elementos = new LinkedList<Elemento>();
	
	public Presupuesto() {
		
	}
	
	
	public double calcularTotalPresupuesto(){
		double tot = 0;
		for(Elemento e: elementos) {
			tot += e.calcularCosto();
		}
		return tot;
	}


	public List<Elemento> getElementos() {
		return elementos;
	}


	public void setElementos(List<Elemento> elementos) {
		this.elementos = elementos;
	}
	
	
}
