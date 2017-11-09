package Questao04;

public class ArCondicionado {
	private boolean isLigado;
	private double temperaturaAlvo;
	private double velocidadeVentilador;
	private String modo;
	private double temperaturaAtual;
	
	public void deligar(){
		this.isLigado=false;
	}
	
	public void aumentaTemperatura(double qtdAumentada){
		if(this.temperaturaAlvo>=(this.temperaturaAtual+=qtdAumentada)){
			this.temperaturaAtual+=qtdAumentada;
		}else{
			System.out.println("A temperatura total excede a temperatura alvo");
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

	public ArCondicionado(boolean isLigado, double temperaturaAlvo, String modo) {
		this.isLigado = isLigado;
		this.temperaturaAlvo = temperaturaAlvo;
		this.modo = modo;
	}
	
	
	
}
