package io.github.unlp_oo.archetype;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		return (monto * 1.02) <= super.getSaldo();
	}
	
	

}
