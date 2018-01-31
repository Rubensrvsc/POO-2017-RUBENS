package model;

public class ContaCorrente extends Conta{
	
	private double saldo;

	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public double getSaldo() {
		return saldo;
	}

	void atualiza(double taxa) {
		// TODO Auto-generated method stub
		this.saldo+=this.saldo*taxa*2;
		
	}


}
