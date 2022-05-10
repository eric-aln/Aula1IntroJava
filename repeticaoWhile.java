package Aula1;

import java.util.Scanner;

public class repeticaoWhile {

	public static void main(String[] args) {
	
		int num,somaNum=0,quantNum = 0;
		float mediaNum;
	
		
		Scanner ler = new Scanner(System.in);

		System.out.println("\nEntre com um número: ");
		num = ler.nextInt();
		while(num!=0)
		{
			somaNum +=num;
			quantNum++;
			System.out.println("\nEntre com um número: ");
			num = ler.nextInt();
		}
		if(quantNum==0)
		{
			System.out.println("\nNão é possível fazer uma divisão por zero.");
		}
		else
		{
		mediaNum = somaNum / quantNum;
		System.out.printf("\nA média ds npumeros lidos foi de: %.2f",mediaNum);
		}
		
	}

}
