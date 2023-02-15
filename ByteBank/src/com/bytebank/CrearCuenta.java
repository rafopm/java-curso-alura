package com.bytebank;

public class CrearCuenta {

	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta(555,124);
		try {
			primeraCuenta.deposita(200);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(primeraCuenta.getSaldo());

		try {
			primeraCuenta.deposita(100);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(primeraCuenta.getSaldo());

		Cuenta segundaCuenta = primeraCuenta;
		try {
			segundaCuenta.deposita(50);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("primera cuenta tiene " + primeraCuenta.getSaldo());
		System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

		System.out.println(primeraCuenta + " es la misma que " + segundaCuenta);

	}
}