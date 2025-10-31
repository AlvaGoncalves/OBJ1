package ar.edu.unlp.info.oo1.ejercicio14_volumenySuperficie;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.setMaterial(material);
		this.setColor(color);
	}

	
	//public abstract double volumenDeMaterial(String Material);
	
	//public abstract double superficieDeColor(String color);
	
	public abstract double calcularVolumen();
	
	public abstract double calcularSuperficie();


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
}
