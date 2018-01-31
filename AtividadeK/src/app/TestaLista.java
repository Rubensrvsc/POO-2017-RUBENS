package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import model.Conta;
public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Conta> c=new ArrayList();
		List<Conta> c=new LinkedList();
		Conta conta;
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int x=random.nextInt(10000);
			conta=new Conta(x);
			c.add(conta);
		}
		//System.out.println(c);

	}

}
