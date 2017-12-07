package model;

public class NumberUtils {
	private int num;

	public NumberUtils(int num) {
		this.num = num;
	}
	
	public boolean isPar(){
		if(num%2==0){
			return true;
		}
		return false;
	}
	public String printCount(){
		String cont="";
		for(int i=0;i<num;i++){
			cont+= i;
		}
		return cont;
	}

	public String printReverseCount(){
		String contReverse="";
		for(int i=num;i>=0;i++){
			contReverse+= i;
		}
		return contReverse;
	}
}
