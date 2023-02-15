package com.bytebank;

public class TestMetodos {
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta(587,225);
		
		try {
			miCuenta.deposita(200);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		miCuenta.saca(100);
		
		Cuenta cuentaKatty = new Cuenta(588,58);
		try {
			cuentaKatty.deposita(2500);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//cuentaKatty.transfiere(2000, miCuenta);
		
		boolean transferenciaExitosa = false;
		try {
			transferenciaExitosa = cuentaKatty.transfiere(2000, miCuenta);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (transferenciaExitosa) {
			System.out.println("Transferencia exitosa"
					+ "");
		}
		
		System.out.println(miCuenta.getSaldo() +" --- " + cuentaKatty.getSaldo());
	}
}
