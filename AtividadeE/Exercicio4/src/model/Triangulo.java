package model;

public class Triangulo {
	public int a,b,c;
	
	public boolean isRetangulo(){
		if((b-c)<a && a< (b+c)){
			return true;
		}
		return false;
	}
	
	public boolean isIsoceles(){
		if(this.isRetangulo()==true){
			if(a==b || a==c || b==c){
				return true;
			}
		}
		return false;
	}
	
	public boolean isEquilatero(){
		if(this.isRetangulo()==true){
			if(a==b && a==c && b==c){
				return true;
			}
		}
		return false;
	}

	public boolean isEscaleno(){
		if(this.isRetangulo()==true){
			if(a != b && a != c && b != c){
				return true;
			}
		}
		return false;
	}
}
