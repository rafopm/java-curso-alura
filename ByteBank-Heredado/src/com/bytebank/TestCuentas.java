package com.bytebank;

public class TestCuentas {
	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente(111, 111);
		cc.deposita(100.0);

		CuentaAhorros cp = new CuentaAhorros(222, 222);
		cp.deposita(100.0);

		try {
			cc.transfiere(10.0, cp);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
