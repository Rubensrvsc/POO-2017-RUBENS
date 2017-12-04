package model;

public class FuncionarioQ6 {
	private double salario;
	
	 public double getBonificacao() {
		 return this.salario * 0.10;
	 } 

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
