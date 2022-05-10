package Aula1;

import java.util.Scanner;

public class HelloWord {

	public static void main(String[] args) {
		
		double n1;
		double n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme a nota 1: ");
		n1 = leia.nextFloat();
		System.out.println("\nInforme a nota 2: ");
		n2 = leia.nextFloat();
		System.out.println("\nInforme a nota 3: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		//System.out.println("\nMédia aritmética: "+media);
		System.out.printf("\nMédia aritmética: %2.2f",media);

		if(media>=7 && media<=10)
		{
			System.out.println("\nAlune aprovade!");
		}
		else if(media>=5 && media<7)
		{
			System.out.println("\nAlune de exame!");
		}
		else
		{
			System.out.println("\nAlune reprovade!");
		}
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n3, 3);
		
		int op;
		System.out.println("\n\t\tMenu de elogios!");
		System.out.println("\n1-Familia muito comprenetrada!");
		System.out.println("\n2-Familia muito unida!");
		System.out.println("\n3-Familia muito criativa!");
		System.out.println("\n4-Familia muito gentil!");
		System.out.println("\nEscolah a sua opção: ");
		op = leia.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("\n1-Familia muito comprenetrada!");
			break;
		
		case 2:
			System.out.println("\n2-Familia muito unida!");
		break;
			
		case 3:
			System.out.println("\n3-Familia muito criativa!");
		break;
		
		case 4:
			System.out.println("\n4-Familia muito gentil!");
			break;

		default:
			System.out.println("\nOpção inválida!");
				
		}
		
	}

}
