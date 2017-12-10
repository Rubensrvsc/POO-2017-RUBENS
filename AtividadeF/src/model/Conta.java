package model;

public abstract class Conta {
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
	
	abstract void atualiza(double taxa);
	
	public double getSaldo() {
		return saldo;
	}
	
	public void tranferir(Conta c1,int dinheiro){
		this.saldo=this.saldo-dinheiro;
		c1.saldo=c1.saldo+dinheiro;
	}

	
	
}
