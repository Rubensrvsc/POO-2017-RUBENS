package Questao04;

public class ArCondicionado {

	private boolean isLigado;
	private double temperaturaAlvo;
	private double velocidadeVentilador;
	private String modo;
	private double temperaturaAtual;
	
	public void desligar(){
		this.isLigado=false;
	}
	public void estadoAtual(){
		System.out.println("Ligado: "+this.isLigado);
		System.out.println("Temperatura alvo: "+this.temperaturaAlvo);
		System.out.println("Modo: "+this.modo);
		System.out.println("Velocidade ventilador: "+this.velocidadeVentilador);
		System.out.println("temperatura atual: "+this.temperaturaAtual);
	}
	
	public void aumentarVentilador(double velocidade){
		this.velocidadeVentilador+=velocidade;
	}
	
	public void aumentaTemperatura(double qtdAumentada){
		if(this.isLigado == true && this.temperaturaAlvo>=(this.temperaturaAtual+qtdAumentada) && this.modo=="frio"){
			this.temperaturaAtual+=qtdAumentada;
			System.out.println("entrou aqui");
		}else{
			System.out.println("nao foi possivel aumentar a temperatura");
		}
	}
	
	public boolean isLigado() {
		return isLigado;
	}

	public double getVelocidadeVentilador() {
		return velocidadeVentilador;
	}

	public String getModo() {
		return modo;
	}

	public double getTemperaturaAtual() {
		return temperaturaAtual;
	}
	public void mudarModo(String modo){
		if(this.getModo()=="frio"){
			this.modo=modo;
		}if(this.getModo()=="ventilador"){
			this.modo=modo;
		}else{
			System.out.println("nao foi possivel mudar o modo");
		}
		}

	public ArCondicionado(double temperaturaAlvo, String modo) {
		this.isLigado = true;
		this.temperaturaAlvo = temperaturaAlvo;
		this.modo = modo;
		this.temperaturaAtual=0;
	}
}
