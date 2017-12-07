package model;

public class Calculadora {
	private int operando1,operando2;

	public Calculadora(int operando1, int operando2) {
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public int getOperando1() {
		return operando1;
	}

	public int getOperando2() {
		return operando2;
	}
	
	public int soma(){
		return operando1+operando2;
	}
	
	public double multiplicacao(){
		return operando1*operando2;
	}

	
	
}
