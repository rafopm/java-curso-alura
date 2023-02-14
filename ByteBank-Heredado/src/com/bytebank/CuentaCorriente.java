package com.bytebank;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
	    super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		double ValorARetirar = valor + 0.2;
		return super.saca(ValorARetirar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
