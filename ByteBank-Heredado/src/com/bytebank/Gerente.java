package com.bytebank;

public class Gerente extends Funcionario implements Autenticacion {
	private AutenticacionUtil autenticador;
	
	 public Gerente() {
	        this.autenticador = new AutenticacionUtil();
	    }
	 
	    @Override
	    public void setContraseña(int contraseña) {
	        this.autenticador.setContraseña(contraseña);
	    }

	    @Override
	    public boolean autenticar(int contraseña) {
	        return this.autenticador.autenticar(contraseña);
	    }
	
	public double getBonificacion() {
	    return super.getSalario() + super.getSalario()*0.1;
	}
	
	
}
