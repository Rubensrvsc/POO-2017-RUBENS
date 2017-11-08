package Questoes;

public class Fibonacci {
	//Também pode ser o desafio
    public static void main(String[] args) {
 
    	int num = 0;     
    	int ant = 0;	
    	int n=15;
    	
    	for (int i = 0; i <= n; i++) {
    		
    		if (i == 1) {
    			num = 1;
    			ant = 0;
    		}
    		else {
    			num += ant;
    			ant = num - ant;
    		}
    		if(num<100){
    			System.out.println("numero: "+num);
    		}else{
    			break;
    		}
    	}
    }
 
}