package model;


/*
 * a. Um atributo titulacao (String) com seus métodos get e set
b. Todo professor recebe seu salário em uma única parcela. Assim, deve-se
sobrescrever
os
métodos
getSalarioPrimeiraParcela
e
getSalarioSegundaParcela. O método getSalarioPrimeiraParcela da classe
Professor deve retornar o valor integral do salário do professor e o método
getSalarioSegundaParcela do professor deve retornar o valor zero.
 */
public class Professor extends Funcionario{
	private String titulacao;
	
	public double getPrimeiraParcela(){
		return super.getSalario();
	}
	
	public double getSegundaParcela(){
		return 0;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}
