package app;

import model.Conta;
import model.ContaCorrente;
import model.exception.SaldoInsuficienteException;

/**
 * Created by aluno on 11/01/18.
 */
public class TesteContas {

    public static void main(String[] args) {
        Conta c=new Conta();
        ContaCorrente cc=new ContaCorrente(1000);

        c.deposita(-10);
        cc.saca(-2000);
        cc.saca(2000);
    }
}
