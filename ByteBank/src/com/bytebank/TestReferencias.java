package com.bytebank;

public class TestReferencias {
	public static void main(String[] args) {
		Cliente Marcela = new Cliente();
		Cuenta CuentaDeMarcela = new Cuenta(589,56);
		Marcela.setNombre("Marcela");
		
		CuentaDeMarcela.setTitular(Marcela);
		try {
			CuentaDeMarcela.deposita(500);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(CuentaDeMarcela.getTitular().getNombre() + " - "+CuentaDeMarcela.getSaldo());
		
	}
}
