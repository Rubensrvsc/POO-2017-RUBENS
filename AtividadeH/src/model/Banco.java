package model;

public class Banco {
    Conta[] c=new Conta[10];
    int cont=0;

    public void adiciona(Conta c){
        this.c[cont]=c;
        cont++;

    }

    public int TotalDeContas(){
        return cont;
    }

    public Conta PegaConta(int x){
        if(x<0 || x>9){
            System.out.println("Conta inexsitente");
        }
        return this.c[x];
    }
}
