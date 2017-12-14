package model;

public class Quadrado extends FiguraGeometrica{
	public int altura;
	public int base;
	public int area() {
		// TODO Auto-generated method stub
		return this.altura*this.base;
	}
	public int perimetro() {
		// TODO Auto-generated method stub
		return this.altura+this.base;
	}

}
