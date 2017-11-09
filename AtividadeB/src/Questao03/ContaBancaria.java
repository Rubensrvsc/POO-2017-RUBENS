package Questao03;

public class ContaBancaria {
	private Pessoa titular;
	private double saldo;
	private String nomeBanco;
	private int agencia;
	
	public ContaBancaria(Pessoa titular, String nomeBanco) {
		this.titular = titular;
		this.nomeBanco = nomeBanco;
	}
	
	public void saque(double saque){
		this.saldo-=saldo;
	}
	public void deposito(double saque){
		this.saldo+=saldo;
	}
	public Pessoa getTitular() {
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public int getAgencia() {
		return agencia;
	}
	
}
