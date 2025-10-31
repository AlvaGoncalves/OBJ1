package ar.edu.unlp.info.oo1.ejercicio14_volumenySuperficie;

public class Esfera extends Pieza {
	private double radio;
	
	
	public Esfera(double radio, String material, String color) {
		super(material, color);
		this.radio = radio;
	}
	

	@Override
	public double calcularVolumen() {
		return 4/3 * Math.PI * Math.pow(radio, 3);
	}

	@Override
	public double calcularSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}

}
