package Aula1;
import java.util.Scanner;
public class ExercicioJavaLacos1 
{

	public static void main(String[] args) {
		// Exercício 1 Laços de decisão
		// Determinar o maior de 3 numeros
		
		Scanner teclado = new Scanner(System.in);
		
        System.out.printf("Qual o primeiro numero? %n");
        double x1 = teclado.nextDouble();
        System.out.printf("Qual o segundo numero? %n");
        double x2 = teclado.nextDouble();
        System.out.printf("Qual o terceiro numero? %n");
        double x3 = teclado.nextDouble();
        double max;
        
        max = x1;
        
        if (max > x2) 
        {
            if (max > x3) 
            {
                System.out.printf("O maior é %d",x1);
            }
            else
            {
                System.out.printf("o maior é %d",x3);
            }  
            
            {
            System.out.printf("o maior é %",x2);
            }
	}

}}
