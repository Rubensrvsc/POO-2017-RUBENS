package model;

public class Carro {
	String placa,modelo,ano;
	long chassi;
	public Carro(String placa, String modelo, String ano, long chassi) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.chassi = chassi;
	}
	
	boolean clonado(Carro c){
		if(c.placa==this.placa && c.chassi==this.chassi){
			return false;
		}else{
			return true;
		}
	}
	
	
}
