package model;

public class DecimalNumber {
	private double num;
	
	public int inteiro(){
		return (int) this.num;
	}
	
	public int decimal(){
		return (int) (this.num-this.inteiro());
	}
}
