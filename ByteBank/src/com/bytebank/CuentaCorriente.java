package com.bytebank;

public class CuentaCorriente extends Cuenta implements Tributacion {

    public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}


    public double getValorImpuesto() {
        return super.getSaldo() * 0.01;
    }

}