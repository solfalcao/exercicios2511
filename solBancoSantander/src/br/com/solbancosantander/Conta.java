package br.com.solbancosantander;

public abstract class Conta {

    private double saldo;

    public abstract double depositarDinheiro (double valor);
    public abstract double sacarDinheiro (double valor);
    public abstract double consultarSaldo (double saldo);


}
