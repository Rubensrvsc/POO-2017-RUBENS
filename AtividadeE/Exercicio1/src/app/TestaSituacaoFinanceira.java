package app;
import model.*;
public class TestaSituacaoFinanceira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SituacaoFinanceira sf=new SituacaoFinanceira(300,600);
		System.out.println(sf.saldo());
	}

}
