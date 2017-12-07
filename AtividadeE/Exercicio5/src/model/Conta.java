package model;

public class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(double valor){
		this.saldo+=valor;
	}
	public void saca(double valor){
		this.saldo-=valor;
	}
	
	public void atualiza(double taxa){
		this.saldo+=this.saldo * taxa;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void tranferir(Conta c1,int dinheiro){
		this.saldo=this.saldo-dinheiro;
		c1.saldo=c1.saldo+dinheiro;
	}

	
	
}
