package com.bytebank;

public class Administrador extends Funcionario implements Autenticacion {
	private AutenticacionUtil autenticador;
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
    public Administrador() {
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

}
