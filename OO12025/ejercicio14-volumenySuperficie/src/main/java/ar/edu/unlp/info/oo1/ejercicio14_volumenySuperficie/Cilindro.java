package ar.edu.unlp.info.oo1.ejercicio14_volumenySuperficie;

public class Cilindro extends Pieza {
	private double radio;
	private double altura;
	
	public Cilindro(double radio, double altura, String material, String color) {
		super(material, color);
		this.setRadio(radio);
		this.setAltura(altura);
	}

	
	@Override
	public double calcularVolumen() {
		 return (Math.PI * Math.pow(radio, altura) * altura);
	}
	
	@Override
	public double calcularSuperficie() {
		return (2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2));
	}
	
	public double superficieDeColor(String color) {
		return 0;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
