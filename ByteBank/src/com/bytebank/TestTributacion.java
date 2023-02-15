package com.bytebank;

public class TestTributacion {

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        try {
			cc.deposita(100.0);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();

        calc.registra(cc);
        calc.registra(seguro);

        
        System.out.println("Saldo: "+cc.getSaldo());
        System.out.println("Impuesto: "+calc.getTotalImpuesto());
    }

}