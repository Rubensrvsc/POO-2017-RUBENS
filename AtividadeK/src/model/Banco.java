package model;

import java.util.List;
import java.util.Map;

public class Banco {
	List<Conta> conta;
	private Map<String,Conta> mapa;
	
	void adiciona(Conta c){
		mapa.put(c.getTitular(),c);
		
	}
	
	void ContaPega(double x){
		for (int i = 0; i < conta.size(); i++) {
			
		}
	}
	

	int pegaQuantidadeContas(){
		return conta.size();
	}
	String buscaPorTitular(String nome){
		for (int i = 0; i < conta.size(); i++) {
			if(conta.get(i).getTitular().equals(nome)){
				return conta.get(i).getTitular();
			}
		}
		return "nome nao encontrado";
	}
	void buscaPorTitularMapa(String nome){
		mapa.get(nome);
	}

}
