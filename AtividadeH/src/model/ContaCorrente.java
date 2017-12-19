package model;

public class ContaCorrente implements ContaTributavel{

    private String nome;
    private String tipo;
    private double saldo;

    public ContaCorrente(double saldo,String nome,String tipo) {
        this.nome=nome;
        this.tipo=tipo;
        this.saldo=saldo;
    }
    public void atualiza(double taxa){
        this.saldo=saldo+(taxa*2);
    }

    @Override
    public void deposita(double valor) {
        this.saldo=saldo+(valor - 0.10);
    }

    @Override
    public double calculaTributos() {
        return getSaldo()*0.01;
    }

    public double getSaldo(){
        return this.saldo;
    }
    @Override
    public void saca(double valor) {
        this.saldo-=valor;
    }

    @Override
    public String getTitular() {
        return this.nome;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }
}
