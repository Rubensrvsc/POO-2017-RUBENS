package Questoes;

import java.util.Date;

public class Funcionario {
	private String nome;
	private Date entrada;
	private String departamaneto;
	private String rg;
	private double salario;
	private boolean isEmpresa;
	Data dataEntrada;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void recebeAumento(double aumento){
		this.salario+=aumento;
	}
	public double salarioAnual(){
		return this.salario*12;
	}
	public void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Salario: "+this.salario);
		System.out.println("Departamento: "+this.departamaneto);
		System.out.println("Rg: "+this.rg);
		System.out.println("Situacao na empresa: "+this.isEmpresa);
		System.out.println("Data: " + this.dataEntrada.formatada());
	}
	

}
