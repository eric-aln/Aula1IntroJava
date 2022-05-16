package Aula1;
import java.util.Scanner;
public class ExercicioJavaLacos1 
{

	public static void main(String[] args) {
		
		// 2 - Maior e Menor
		
		try (Scanner leia = new Scanner(System.in)) {
			int menor = 0;
			int maior = 0;
			System.out.println(" Tres números:");
			int a = leia.nextInt();
			int b = leia.nextInt();
			int c = leia.nextInt();
			
			if((a < b) && (a < c))
			    menor = a;

			else if((b < a)&&(b < c))
			    menor = b;

			else if((c < a)&&(c < b))
			    menor = c;

			if((a > b) && (a > c))
			    maior = a;

			else if((b > a)&&(b > c))
			    maior = b;

			else if((c > a)&&(c > b))
			    maior = c;
			System.out.println(" Maior: " + maior + " Menor:" + menor);
		}
	}
}