package Questoes;

public class AtualizadorDeContas {
	
	private double saldototal=0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic=selic;
	}
	
	public void roda(Conta c){
		System.out.println("anterior: "+c.getSaldo());
		c.atualiza(selic);
		this.saldototal+=this.saldototal+c.getSaldo();
		System.out.println("atual: "+c.getSaldo());
		
	}

	public double getSaldototal() {
		return saldototal;
	}
}
