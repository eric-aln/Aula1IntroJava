package Aula1;

import java.util.Scanner;

public class Ex4While {

	public static void main(String[] args) {
		
		int idade=0,gen=0,contPC=0,contMN=0,contHA=0,contNBC=0,contPN40=0,contPC18=0,x=1,fp=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while(idade<1 || idade>130);
			{
				System.out.println("\nIdade inexistente, por favor entre com a sua idade");
				idade = leia.nextInt();
			}
			System.out.println("\nEntre com o seu genero: \n1 - Feminino \n2 - Mesculino \n3 - Não binário");
			gen = leia.nextInt();
			while(gen<1 || gen>3)
			{
				System.out.println("\nGenero inválido, por favor entre com a seu genero.");
				gen = leia.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicológico: \n1 - Pessoa calma \n2 - Pessoa nervosa \n3 - Pessoa agressiva");
			fp = leia.nextInt();
			while(fp<1 || fp>3);
			{
				System.out.println("\nFator psicológico inválido, por favor entre com a seu fator.");
				fp = leia.nextInt();
			}
			if(fp==1)
			{
				contPC++;
			}
			if(gen==1 && fp==2)
			{
				contMN++;
			}
			if(gen==2 && fp==3)
			{
				contHA++;
			}
			if(gen==3 && fp==1)
			{
				contNBC++;
			}
			if(fp==2 && idade>40)
			{
				contPN40++;
			}
			if(fp==1 && idade<18)
			{
				contPC18++;
			}
			x++;
		
		}
		System.out.println("\nQuantidade de pessoas calmas: "+contPC);
		System.out.println("\nQuantidade de mulheres nervosas: "+contMN);
		System.out.println("\nQuantidade de homens agressivos: "+contHA);
		System.out.println("\nQuantidade de pessoas não binárias calmas: "+contNBC);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: "+contPN40);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: "+contPC18);

	}

}
