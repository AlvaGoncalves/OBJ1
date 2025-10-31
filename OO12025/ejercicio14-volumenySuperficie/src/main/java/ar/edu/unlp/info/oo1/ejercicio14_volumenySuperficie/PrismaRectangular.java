package ar.edu.unlp.info.oo1.ejercicio14_volumenySuperficie;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(double lM, double lm, double h, String material, String color) {
		super(material, color);
		this.ladoMayor = lM;
		this.ladoMenor = lm;
		this.altura = h;
	}

	@Override
	public double calcularVolumen() {
		return (ladoMayor * ladoMenor * altura );
	}

	@Override
	public double calcularSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}

	public double getLadoMayor() {
		return ladoMayor;
	}

	public void setLadoMayor(double ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

	public double getLadoMenor() {
		return ladoMenor;
	}

	public void setLadoMenor(double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
