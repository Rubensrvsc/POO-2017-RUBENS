package app;

import model.*;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//existe o erro pois a classe mae nao tem o metodo isValido() que a classe Funcionario implementou
		//PessoaFisica f=new Funcionario();
		Funcionario f=new Funcionario();
		f.isValido();

	}

}
