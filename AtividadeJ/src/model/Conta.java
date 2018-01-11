package model;

/**
 * Created by aluno on 11/01/18.
 */
public class Conta {

    int numero;
    double saldo;
    double limite;
    public boolean saca(double quantidade) {
        if (quantidade > this.saldo + this.limite){
            throw new IllegalArgumentException("Quantidade digitada maior que o limite");
        } else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public void atualiza(double taxa){
        this.saldo+=taxa;
    }
    public void deposita(double valor) {
        if (valor < 0) {
            //throw new IllegalArgumentException("Você tentou depositar um valor negativo");
            throw new IllegalArgumentException("Você tentou depositar" +
                    " um valor negativo");
            //Questao 6
            //throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor-0.10;
        }
    }
}
