package model;

public class Produto {
	int quantidade;
	
	public Produto(int quantidade){
		this.quantidade=quantidade;
	}
	
	public void acumula(){
		this.quantidade++;
	}
}
