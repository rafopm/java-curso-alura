package com.bytebank;

public class TestMetodos {
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta();
		
		miCuenta.deposita(200);
		miCuenta.saca(100);
		
		Cuenta cuentaKatty = new Cuenta();
		cuentaKatty.deposita(2500);
		
		//cuentaKatty.transfiere(2000, miCuenta);
		
		boolean transferenciaExitosa = cuentaKatty.transfiere(2000, miCuenta);
		if (transferenciaExitosa) {
			System.out.println("Transferencia exitosa"
					+ "");
		}
		
		System.out.println(miCuenta.getSaldo() +" --- " + cuentaKatty.getSaldo());
	}
}
