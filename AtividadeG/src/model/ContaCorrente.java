package model;

public class ContaCorrente extends Conta{
	private double saldo;


	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		// TODO Auto-generated method stub
		this.saldo+=valor;
		
	}

	public void saca(double valor) {
		// TODO Auto-generated method stub
		this.saldo-=valor;
		
	}

}
