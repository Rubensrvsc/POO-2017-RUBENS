package Questoes;

import java.util.Scanner;

public class TestaFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibonacci = new Fibonacci();
		Scanner numero=new Scanner(System.in);
		System.out.println("digite o numero: ");
		int num=numero.nextInt();
		for (int i = 1; i <= num; i++) {
			int resultado = fibonacci.calcula(i);
			System.out.println(resultado);
		}
		System.out.println("com operador ternario!!!");
		for (int i = 1; i <= num; i++) {
			int resultado = fibonacci.calcula_ternario(i);
			System.out.println(resultado);
		}

	}

}
