package model;

public class ContaPoupanca extends ContaCorrente{
	private double saldo;
	
	public ContaPoupanca(double valor){
		super(valor);
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo+=valor;
		
	}

}
