package com.bytebank;
public abstract class Cuenta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Cuenta(int agencia, int numero){
        Cuenta.total++;
        System.out.println("Total de cuentas es " + Cuenta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estoy creando una cuenta" + this.numero);
    }

    public abstract void deposita(double valor);

    public void sacar(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;           
}

    public void transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException{
        this.sacar(valor);
        destino.deposita(valor);
}

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("No pueder ser el valor menor o igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("No pueder ser el valor menor o igual a ");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Cuenta.total;
    }

}


