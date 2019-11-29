package br.com.solbancosantander;

public class Cliente {
    private int numeroCliente;
    private String sobrenome;
    private String RG;
    private String CPF;

    public Cliente (){

    }

   public void getNumeroCliente{
        return numeroCliente;
    }

    public void getSobrenome {
        return sobrenome;
    }

    public void getRG {
        return RG;
    }

    public void getCPF {
        return CPF
    }

    public String setSobrenome (String meuSobrenome) {
        this.sobrenome = meuSobrenome;
    }

    public int setNumeroCliente (int numero){
        this.numeroCliente = numero;
    }
}
