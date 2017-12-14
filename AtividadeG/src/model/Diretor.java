package model;

public class Diretor extends Funcionario{
	private double salario;


	public Diretor(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public double getBonificacao() {
		// TODO Auto-generated method stub
		return getSalario() * 0.25;
	}

}
