package model;


public class Funcionario extends Pessoa{
	private int matricula;
	private double salario;
	
	public double setPrimeiraParcela(){
		return 0.6*getSalario();
	}
	
	public double setSegundaParcela(){
		return 0.4*getSalario();
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
