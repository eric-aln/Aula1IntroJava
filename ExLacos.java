package Aula1;

import java.util.Scanner;

public class ExLacos {

	public static void main(String[] args) {
		
		//4- Faça um programa que entre com três números e coloque em ordem crescente.

		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com C: ");
		c = leia.nextInt();
		
		if(a<=b && b<c)
		{
			System.out.println("Ordem crescente:",+a+" , "+b+" , "+c+);
		}
		else if(a<=c && c<=b)
		{
				System.out.println("Ordem crescente:",+a+" , "+c+" , "+b+);
		}
		else if(b<=a && c<=b)
		{
				System.out.println("Ordem crescente:",+b+" , "+a+" , "+c+);
		}
		else if(a<=c && c<=b)
		{
				System.out.println("Ordem crescente:",+a+" , "+c+" , "+b+);
		}
		
		}

	}

}
