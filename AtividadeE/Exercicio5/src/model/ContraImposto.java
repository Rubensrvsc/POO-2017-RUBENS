package model;

public class ContraImposto {
	private double saldo;
	private double numero;
	public ContraImposto(double saldo, double numero) {
		this.saldo = saldo;
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getNumero() {
		return numero;
	}
	
	public boolean isCredito(){
		if(this.saldo>0){
			return true;
		}
		return false;
	}
	
	public boolean idDebito(){
		if(this.saldo<0){
			return true;
		}
		return false;
	}
	
	private double retemImposto(double valorDebito){
		double retira=valorDebito*0.38;
		return valorDebito-retira;
	}
}
