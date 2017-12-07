package model;

public class Circulo {
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}
	
	public double area(){
		return 3.14*raio*raio;
	}
	
	public double perimetro(double c){
		return c*3.14*raio;
	}

}
