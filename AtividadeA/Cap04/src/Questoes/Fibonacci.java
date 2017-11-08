package Questoes;

public class Fibonacci {
	
	/*este metodos � mais lento pois uma chamada
	 * de fun��o exige mais processameto do que a simples
	 * itera��o
	 */
	public int calcula(int num){
		if(num==0){
			return 0;
		}if(num==1){
			return 1;
		}
		return calcula(num-1)+calcula(num-2);
	}
	
	public int calcula_ternario(int num){
		return num<=2?1:calcula_ternario(num-1)+calcula_ternario(num-2);
	}

}
