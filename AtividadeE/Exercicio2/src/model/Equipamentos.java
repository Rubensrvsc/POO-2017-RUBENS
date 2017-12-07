package model;

public class Equipamentos {
	private boolean ligado;

	public Equipamentos(boolean ligado) {
		this.ligado = ligado;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	
	public void ligar(){
		if(this.ligado==true){
			return;
		}
		this.ligado=true;
	}
	
	public void desligar(){
		if(this.ligado==false){
			return;
		}
		this.ligado=false;
	}
	

	public void inverte(){
		if(this.ligado==true){
			this.desligar();
		}
		this.ligar();
	}
	
	public boolean estaLigado(){
		return this.ligado=true;
	}
	
	

}
