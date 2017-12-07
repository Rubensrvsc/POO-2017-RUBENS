package app;
import model.*;
public class TestaEquipamentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipamentos e1=new Equipamentos(true);
		e1.inverte();
		if(e1.isLigado()==true){
			System.out.println("ligado");
		}else{
			System.out.println("desligado");
		}
		
		Equipamentos e2=new Equipamentos(false);
		e2.inverte();
		if(e2.isLigado()==true){
			System.out.println("ligado");
		}else{
			System.out.println("desligado");
		}
	}

}
