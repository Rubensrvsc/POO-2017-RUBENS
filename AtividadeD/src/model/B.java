package model;


public class B extends A {
	public String metodo1() {
		//chama o metodo da classe A
		//return super.metodo1();
		return "metodo 1, classe B";
	}
	public String metodo2() {
		return "metodo 2, classe B";
	}
	//nao é reescrita e nem sobrecarga
	/*public String metodo1() {
		return "metodo 1 da classe B";
	}
	public String metodo1() {
		return "metodo 1 da classe B, segunda versão";
	}*/
}