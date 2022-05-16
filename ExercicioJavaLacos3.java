package Aula1;
import java.util.Scanner;
public class ExercicioJavaLacos3 {

	public static void main(String[] args) {
		/* 3 - Qual categoriaFaça um programa que receba a idade de uma pessoa e 
		 * mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto*/
		
		Scanner leia = new Scanner(System.in);
		
		 System.out.print ("Entre com a sua idade: ");
		 int idade = leia.nextInt();
		
		 if(idade>=10 && idade<=14)
	         System.out.print ("Categoria Infantil");
	      else if(idade>=15 && idade<=17)
	         System.out.print ("Categoria Jevenil");
	      else if(idade>=18&& idade<=25)
	         System.out.print ("Categoria Adulto");
		 
	      else;
	         System.out.print ("Categoria Inexistente");
		 
		
	}

}
