package model;

public class Pilha {
	int[] elementos;
	int indice;
	int tamanho;
	
	public Pilha(int tamanho){
		this.tamanho=tamanho;
		elementos= new int[tamanho];
	}
	
	public void empilhar(int i){
		elementos[indice]=i;
		if(++indice > tamanho){
			elementos[indice]=0;
		}
	}

}
