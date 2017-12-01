package model;


public class Diarista extends Empregado {
	public double calcSalario() { 
		return getSalario()/30;
	}
}