package com.bytebank;

public class TestReferencias {
	public static void main(String[] args) {
		Cliente Marcela = new Cliente();
		Cuenta CuentaDeMarcela = new Cuenta(589,56);
		Marcela.setNombre("Marcela");
		
		CuentaDeMarcela.setTitular(Marcela);
		CuentaDeMarcela.deposita(500);
		
		System.out.println(CuentaDeMarcela.getTitular().getNombre() + " - "+CuentaDeMarcela.getSaldo());
		
	}
}
