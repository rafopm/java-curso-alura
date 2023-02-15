package com.bytebank;

public class TestCuentaConExcepcionChecked {

    public static void main(String[] args) {

        Cuenta c = new Cuenta(123,456);
        try {
            c.deposita(500);
        } catch(MiExcepcion ex) {
            System.out.println("tratamiento ....");
        }

    }
}