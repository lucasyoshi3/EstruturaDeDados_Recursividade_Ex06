package controller;

public class Controle {

	public int quantidade(int num, int qntNum) {
		// TODO Auto-generated method stub
		if(num==0) return 0;
		
		if(num%10==qntNum) return 1+quantidade(num/10, qntNum);
		
		return quantidade(num/10, qntNum);
	}
}
