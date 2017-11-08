package Questoes;

public class Questoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questao 1
		for(int i =150;i<=300;i++){
			System.out.println("Numero: "+i);
		}
		//questao 2
		int soma=0;
		for(int i =1;i<=1000;i++){
			soma+=i;
		}
		System.out.println("Soma total: "+soma);
		//questao 3
		for(int i=1;i<=100;i++){
			if(i%3==0){
				System.out.println("O numero: "+i+" eh multiplo de 3");
			}
		}
		//questao 4
		for(int i=1;i<=10;i++){
			int j=i;
			int s=0;
			while(j>1){
				int x=j*(j-1);
				s+=x;
				j--;
			}
			System.out.println("O fatorial de: "+i+" eh: "+s);
		}
	}

}
