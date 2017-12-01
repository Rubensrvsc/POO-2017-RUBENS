package app;

import model.*;
public class Q04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criar um metodo na classe animal
		//Bovino a = new Animal();
		//a.setProducaoLeite();
		
		//peixe nao implementa Animal
		//Peixe p = new Animal();
		int cont=0;
		
		Animal an[]=new Animal[10];
		Animal a=new Animal();
		an[cont]=a;
		cont++;
		Animal a1=new Animal();
		an[cont]=a1;
		cont++;
		
		Animal p=new Animal();
		an[cont]=p;
		cont++;
		Animal p1=new Animal();
		an[cont]=p1;
		cont++;

		Animal b=new Animal();
		an[cont]=b;
		cont++;
		Animal b1=new Animal();
		an[cont]=b1;
		cont++;
		Animal b2=new Animal();
		an[cont]=b2;
		cont++;
		
		for(int i=0;i<cont;i++){
			if(an[i] instanceof Animal){
				System.out.println("Animal!!!");
			}if(an[i] instanceof Bovino){
				System.out.println("Bovino!!!");
			}if(an[i] instanceof Peixe){
				System.out.println("Peixe!!!");
			}
		}

	}

}
