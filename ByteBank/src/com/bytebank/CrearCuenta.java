package com.bytebank;

public class CrearCuenta {

	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta(555,124);
		primeraCuenta.deposita(200);
		System.out.println(primeraCuenta.getSaldo());

		primeraCuenta.deposita(100);
		System.out.println(primeraCuenta.getSaldo());

		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.deposita(50);

		System.out.println("primera cuenta tiene " + primeraCuenta.getSaldo());
		System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

		System.out.println(primeraCuenta + " es la misma que " + segundaCuenta);

	}
}