package Questao04;

import java.util.Scanner;

public class TestaArCondicionado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		System.out.println("1-ligar 2-desligar 3-aumentar temperatura 4-ver estado "
				+ "5-mudar modo 6-aumentar ventilador");
		ArCondicionado ar=new ArCondicionado(0,"");
		Scanner sc=new Scanner(System.in);
		op=sc.nextInt();
		while(true){
			if(op==1){
				int velocidade=0;
				String modo="";
				System.out.println("digite a velocidade e o modo: ");
				Scanner s=new Scanner(System.in);
				velocidade=s.nextInt();
				modo=s.next();
				ar=new ArCondicionado(velocidade,modo);
			}if(op==2){
				ar.desligar();
			}if(op==3){
				System.out.println("digite a temperatura: ");
				Scanner scanner=new Scanner(System.in);
				double aumenta=0;
				aumenta=scanner.nextDouble();
				ar.aumentaTemperatura(aumenta);
			}if(op==4){
				ar.estadoAtual();
			}if(op==5){
				System.out.println("digite o modo: ");
				Scanner scanner=new Scanner(System.in);
				String modo="";
				modo=scanner.next();
				ar.mudarModo(modo);
			}if(op==6){
				System.out.println("digite a velocidade: ");
				Scanner scanner=new Scanner(System.in);
				double aumentaVentilador=0;
				aumentaVentilador=scanner.nextDouble();
				ar.aumentarVentilador(aumentaVentilador);
			}
		System.out.println("1-ligar 2-desligar 3-aumentar temperatura 4-ver estado "
					+ "5-mudar modo 6-aumentar ventilador");
		op=sc.nextInt();
		}
	}

}
