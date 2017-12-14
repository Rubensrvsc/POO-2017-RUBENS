package model;

public class Triangulo extends FiguraGeometrica{
	public int lado1;
	public int lado2;
	public int lado3;
	public int altura;
	
	public int area() {
		// TODO Auto-generated method stub
		return this.lado3*this.altura;
	}
	public int perimetro() {
		// TODO Auto-generated method stub
		return this.lado1+this.lado2+this.lado3;
	}
}
