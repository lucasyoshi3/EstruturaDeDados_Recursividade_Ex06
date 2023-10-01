package view;
import java.util.*;

import controller.Controle;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Controle controle=new Controle();
		
		int num=0;
		while(num<10 | num>999999) {
			System.out.println("Num entre 10 a 999999: ");
			num=sc.nextInt();
		}
		
		int qntNum=10;
		while(qntNum<0 | qntNum>9) {
			System.out.println("Num identificador entre 0 a 9: ");
			qntNum=sc.nextInt();
		}
		
		int vezes=controle.quantidade(num,qntNum);
		System.out.println("Quantidade de vezes que o numero "+qntNum+" aparece: "+vezes);
	}
}
