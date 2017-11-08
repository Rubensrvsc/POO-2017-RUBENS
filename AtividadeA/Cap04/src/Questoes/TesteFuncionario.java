package Questoes;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		f2.setNome("Danilo");
		f2.setSalario(100);
		
		f1.setNome("Danilo");
		f1.setSalario(100);
		Data data=new Data();
		f1.dataEntrada=data;
		f1.dataEntrada.dia=8;
		f1.dataEntrada.mes=11;
		f1.dataEntrada.ano=2017;
		//f2=f1;
		//conclusao é que apesar de ter os mesmos atributos
		//as instancias apontam para partes diferentes da memoria
		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		f1.mostra();
		f1.recebeAumento(50);
		
		System.out.println("salario atual:" + f1.getSalario());
		System.out.println("ganho anual:" + f1.salarioAnual());
	}

}
