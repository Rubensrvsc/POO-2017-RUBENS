package Questao03;

public class Apartamento {
	private Pessoa proprietario;
	private int andar;
	private double mensalidadeCondominio;
	private double qtdDevida;
	private int qtdMoradores;
	
	public Apartamento(int andar, double mensalidadeCondominio, double qtdDevida) {
		this.andar = andar;
		this.mensalidadeCondominio = mensalidadeCondominio;
		this.qtdDevida = qtdDevida;
	}
	
	public void qtdCalote(double qtd){
		this.qtdDevida+=qtd;
	}
	public void aumentaMoradores(double qtd){
		this.qtdMoradores+=qtd;
	}
	public void diminuiMoradores(double qtd){
		this.qtdMoradores-=qtd;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public int getAndar() {
		return andar;
	}
	public double getMensalidadeCondominio() {
		return mensalidadeCondominio;
	}
	public double getQtdDevida() {
		return qtdDevida;
	}
	public int getQtdMoradores() {
		return qtdMoradores;
	}

}
