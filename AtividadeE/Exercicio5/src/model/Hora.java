package model;

public class Hora {
	private int 
	hora,minuto,segundo;

	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public int lerHora(){
		return this.hora;
	}
	
	public int lerMinuto(){
		return this.minuto;
	}
	
	public int lerSegundo(){
		return this.segundo;
	}
	
	public String horaCompleta(){
		return ""+hora+""+minuto+""+segundo;
	}
	

}
