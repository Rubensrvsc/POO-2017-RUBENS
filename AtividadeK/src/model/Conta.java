package model;

public class Conta implements Comparable<Conta>{
	private double saldo;
	private String titular;
	/*public Conta(double saldo) {
		this.saldo = saldo;
	}*/
	
	public void deposita(double valor){
		this.saldo+=valor;
	}
	public void saca(double valor){
		this.saldo-=valor;
	}
	
	//abstract void atualiza(double taxa);
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void tranferir(Conta c1,int dinheiro){
		this.saldo=this.saldo-dinheiro;
		c1.saldo=c1.saldo+dinheiro;
	}
	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return this.getTitular().compareTo(o.getTitular());
	}
	
}
