package Questao03;

public class Veiculo {

	private Montadora montadora;
	private double motorizacao;
	private String modelo;
	private double pre�o;
	private double TamanhoTanque;
	private int ano;
	private double QtdCombustivel;
	private double VelocidadeMomentanea;
	
	public Veiculo(Montadora montadora, double motorizacao, String modelo,
			double pre�o, double tamanhoTanque, int ano) {
		this.montadora = montadora;
		this.motorizacao = motorizacao;
		this.modelo = modelo;
		this.pre�o = pre�o;
		TamanhoTanque = tamanhoTanque;
		this.ano = ano;
	}
	
	public void AumentaVelocidade(double velocidade){
		this.VelocidadeMomentanea+=velocidade;
	}
	
	public void ColocaCombustivel(double combustivel){
		this.QtdCombustivel+=combustivel;
	}
	
	public double getMotorizacao() {
		return motorizacao;
	}
	public String getModelo() {
		return modelo;
	}
	public double getPre�o() {
		return pre�o;
	}
	public double getTamanhoTanque() {
		return TamanhoTanque;
	}
	public int getAno() {
		return ano;
	}
	public double getQtdCombustivel() {
		return QtdCombustivel;
	}
	public double getVelocidadeMomentanea() {
		return VelocidadeMomentanea;
	}

	public Montadora getMontadora() {
		return montadora;
	}
}
