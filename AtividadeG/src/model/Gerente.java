package model;

public class Gerente extends Funcionario{
	private double salario;

	public Gerente(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public double getBonificacao() {
		// TODO Auto-generated method stub
		return getSalario() * 0.15;
	}

}
