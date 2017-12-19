package app;
import model.*;
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(200);
        cc.deposita(100);
        System.out.println(cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());

        //A referencia t só chama metodos seus que foram implementados em classes que assinaram o seu contrato
        //System.out.println(t.getSaldo());
    }
}
