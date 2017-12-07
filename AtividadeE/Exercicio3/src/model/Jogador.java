package model;

public class Jogador {
	public int vidas;

	public Jogador() {
		this.vidas = 5;
	}
	
	public boolean isLimiteMaxVidas(){
		if(this.vidas==5){
			return true;
		}
		return false;
	}
	
	public boolean isLimiteMinVidas(){
		if(this.vidas==0){
			return true;
		}
		return false;
	}
	
	public void incrementa(){
		if(this.isLimiteMaxVidas()==true){
			
		}
		this.vidas++;
	}
	
	public void decrementa(){
		if(this.isLimiteMinVidas()==true){
			
		}
		this.vidas--;
	}
	public void doarVida(Jogador j){
		j.vidas++;
		this.vidas--;
		if(j.vidas==5 && this.vidas==0){
			j.vidas--;
			this.vidas++;
		}
	}
	
}
