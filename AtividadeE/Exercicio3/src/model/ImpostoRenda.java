package model;

public class ImpostoRenda {
	public double rendaBruta;

	public ImpostoRenda(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public double calculaImposto(){
		double imposto = 0;
		if(this.rendaBruta>=0 && this.rendaBruta<=1000){
			imposto=this.rendaBruta * 0.05;
		}if(this.rendaBruta>1000){
			imposto=this.rendaBruta * 0.10;
		}
		return imposto;
	}
	
	public double calculaRendaLiquida(){
		return this.rendaBruta-this.calculaImposto();
	}
	
}
