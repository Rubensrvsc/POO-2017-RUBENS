package app;
import model.*;
public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c1=new ContaCorrente(100);
		//Conta c2=new Conta(300);
		
		
		c1.saca(10);
		
		System.out.println(c1.getSaldo());
		
		Conta[] contas=new Conta[10];
		//contas[0]=new Conta(10);
		System.out.println(contas[0].getSaldo());
	}

}
