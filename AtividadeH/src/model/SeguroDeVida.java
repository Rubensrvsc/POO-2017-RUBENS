package model;

public class SeguroDeVida implements Tributavel {

    private double valor;
    private String titular;
    private int numeroApolice;

    public double calculaTributos() {
        return 42 + this.valor * 0.02;
    }

    @Override
    public String getTitular() {
        return this.titular;
    }

    @Override
    public String getTipo() {
        return null;
    }
}
