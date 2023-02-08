package com.ejemplos;

public class EjercicioFactorial {
	public static void main(String args[]) {

		//FACTORIAL 1
		System.out.println("EJEMPLO FACTORIAL 1");
		for (int fila = 1; fila <= 10; fila++) {
			int factorial = 1;
			System.out.print("1");
			for (int columna = 1; columna <= 10; columna++) {
				if (fila < columna) {
					break;
				}
				System.out.print("*"+columna);
				factorial = factorial * columna;
			}
			System.out.println("=" + factorial);
		}
		
		//FACTORIAL 2
		System.out.println();
		System.out.println("EJEMPLO FACTORIAL 2");
		int factorial2 = 1;
		for (int a=1; a<=10; a++) {
			System.out.print("1");
			for(int b=1; b<=a; b++) {
				System.out.print("*"+b);
			}
			
			
			factorial2 *= a;
			
			System.out.println("="+factorial2);
		}

	}
}
