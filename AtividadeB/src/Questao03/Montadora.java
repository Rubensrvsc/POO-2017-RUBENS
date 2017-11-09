package Questao03;

public class Montadora {
	private String local;
	private int qtdCarrosProduzidos;
	private double faturamento;
	private int lucro;
	private int qtdFuncionarios;
	
	public Montadora(String local, int qtdCarrosProduzidos, int qtdFuncionarios) {
		this.local = local;
		this.qtdCarrosProduzidos = qtdCarrosProduzidos;
		this.qtdFuncionarios = qtdFuncionarios;
	}
	public String getLocal() {
		return local;
	}
	public int getQtdCarrosProduzidos() {
		return qtdCarrosProduzidos;
	}
	public double getFaturamento() {
		return faturamento;
	}
	public int getLucro() {
		return lucro;
	}
	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

}
