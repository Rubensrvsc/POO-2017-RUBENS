package model;

import model.exception.SaldoInsuficienteException;

/**
 * Created by aluno on 11/01/18.
 */
public class ContaCorrente {
    private double saldo;
    private double limite;


    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite(){
        return this.limite;
    }

    public void deposita(double valor) {
        // TODO Auto-generated method stub
        this.saldo+=valor;

    }

    public void saca(double valor) throws SaldoInsuficienteException{
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(valor);
        }
        this.saldo -= (valor + 0.10);
    }
}