package Questao05;

public class Circulo {
	private double raio;
	private double diametro;
	private double x;
	private double y;
	private double circuferencia;
	private double area;
	private double pi=3.14;
	
	public void calculaCircufererncia(){
		raioPositivo();
		this.circuferencia=2*pi*this.raio;
	}
	public void calculaArea(){
		raioPositivo();
		this.area=this.pi*(this.raio*this.raio);
	}
	public void raioPositivo(){
		if(this.raio<1){
			this.raio=1;
		}
	}
	public void defineCentro(double x,double y){
		this.x=x;
		this.y=y;
	}

}
