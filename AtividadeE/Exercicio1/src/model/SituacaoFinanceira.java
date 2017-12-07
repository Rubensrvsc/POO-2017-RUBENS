package model;

public class SituacaoFinanceira {
	private double valorCredito,valorDebito;
	
	public SituacaoFinanceira(double valorCredito, double valorDebito) {
		this.valorCredito = valorCredito;
		this.valorDebito = valorDebito;
	}
	public double saldo(){
		return this.valorCredito-this.valorDebito;
	}
	public double getValorCredito() {
		return valorCredito;
	}


	public double getValorDebito() {
		return valorDebito;
	}
}
