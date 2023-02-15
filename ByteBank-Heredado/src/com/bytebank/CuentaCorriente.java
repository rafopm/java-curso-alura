package com.bytebank;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
	    super(agencia, numero);
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2;
        super.sacar(valorASacar);
}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
