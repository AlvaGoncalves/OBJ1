package io.github.unlp_oo.archetype;

public class CuentaCorriente extends Cuenta{
	private double limiteDescubierto;
	
	
	public CuentaCorriente() {
		this.limiteDescubierto = 0;
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		// TODO Auto-generated method stub
		return false;
	}

}
