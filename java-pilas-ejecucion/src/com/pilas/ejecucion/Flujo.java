package com.pilas.ejecucion;

public class Flujo {

	public static void main(String[] args) throws MiExcepcion {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}

	public static void metodo1() throws MiExcepcion {
		System.out.println("Inicio metodo1");
		metodo2();
		
		System.out.println("Fin metodo1");
	}

	private static void metodo2() throws MiExcepcion {
		System.out.println("Inicio del metodo2");
		throw new MiExcepcion ("Surgió un error");
	}
}