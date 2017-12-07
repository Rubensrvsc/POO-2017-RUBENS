package app;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=0;
		if((a-- > 11) || (++b <= 100)){
			System.out.println("eh: "+a*b);
		}else{
			System.out.println(a-b);
		}

	}

}
