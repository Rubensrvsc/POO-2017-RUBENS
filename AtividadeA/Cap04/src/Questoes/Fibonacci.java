package Questoes;

public class Fibonacci {
	
	/*este metodos é mais lento pois uma chamada
	 * de função exige mais processameto do que a simples
	 * iteração
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
