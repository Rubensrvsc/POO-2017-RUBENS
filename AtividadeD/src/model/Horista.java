package model;


public class Horista extends Diarista {
	public double calcSalario() { 
		return getSalario()/24;
	}
}
