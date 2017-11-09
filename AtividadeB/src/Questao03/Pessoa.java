package Questao03;
/*
 * A classe Pessoa pode ser referenciadad nas classes Apartamento,ContaBancaria e Funcionario
 */
public class Pessoa {
	private String nome;
	private int cpf;
	private int idade;
	private String CargoNoTrabalho;
	
	public Pessoa(String nome, int cpf, int idade, String cargoNoTrabalho) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.CargoNoTrabalho = cargoNoTrabalho;
	}
	public String getCargoNoTrabalho() {
		return CargoNoTrabalho;
	}
	public String getNome() {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}

}
