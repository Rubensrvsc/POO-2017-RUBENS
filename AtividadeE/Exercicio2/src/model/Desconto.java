package model;

public class Desconto {
	private int valor;
	private int desconto;
	public Desconto(int valor, int desconto) {
		this.valor = valor;
		this.desconto = desconto;
	}
	
	public int calcula(){
		return this.valor*(1-(desconto/100));
	}

}
