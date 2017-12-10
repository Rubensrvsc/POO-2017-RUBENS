package model;

public class ContaPoupanca extends Conta{
	
	private double saldo;


	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	void atualiza(double taxa) {
		// TODO Auto-generated method stub
		this.saldo+=this.saldo*taxa*3;
		
	}

}
