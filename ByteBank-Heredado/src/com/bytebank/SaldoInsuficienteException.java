package com.bytebank;

public class SaldoInsuficienteException extends Exception{  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//checked

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}