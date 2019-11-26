package br.com.solbancosantander;

public class Cliente {
    private int numeroCliente;
    private String sobrenome;
    private String RG;
    private String CPF;

    public Cliente (){

    }

    public Cliente (int numeroCliente, String CPF){
        this.numeroCliente = numeroCliente;
        this.CPF = CPF;
    }


}
