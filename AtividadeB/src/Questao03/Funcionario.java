package Questao03;

public class Funcionario {
	private Pessoa cargo;
	private double salario;
	private boolean isEmpresa;
	private String nome;
	
	public Funcionario(Pessoa cargo, double salario, boolean isEmpresa,
			String nome) {
		this.cargo = cargo;
		this.salario = salario;
		this.isEmpresa = isEmpresa;
		this.nome = nome;
	}
	
	public void aumentaSalario(double aumenta){
		this.salario+=salario;
	}
	public void diminuiSalario(double aumenta){
		this.salario-=salario;
	}
	public void demite(){
		this.isEmpresa=false;
	}
	public Pessoa getCargo() {
		return cargo;
	}
	public double getSalario() {
		return salario;
	}
	public boolean isEmpresa() {
		return isEmpresa;
	}
	public String getNome() {
		return nome;
	}

}
