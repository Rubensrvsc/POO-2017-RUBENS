package app;
import model.*;
public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//os prints conttem o mesmo resulta do porque 
		//as referencias c1e c3 apontam para c2
		Conta c1=new Conta(100);
		Conta c2=new Conta(300);
		Conta c3=null;
		
		c1=c2;
		c3=c1;
		c1.saca(10);
		c1.tranferir(c2, 50);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		System.out.println(c3.getSaldo());
		
		Conta[] contas=new Conta[10];
		contas[0]=new Conta(10);
		System.out.println(contas[0].getSaldo());
	}

}
