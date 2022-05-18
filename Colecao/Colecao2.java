package Colecao;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {

	public static void main(String[] args) {
		// 
		
		int op;
		Scanner ler = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("_______________________________________");
			System.out.println("\n(1)Adicionar um produto no estoque?");
			System.out.println("\n(2)Remover um produto no estoque?");
			System.out.println("\n(3)Atualizar um produto do estoque?");
			System.out.println("\n(1)Mostrar todos os produtos do estoque?");
			System.out.println("\n(0)Encerrar o programa");
			System.out.println("_______________________________________");
			System.out.println("Digite sua opção: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque:");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto que quer remover do estoque:");
				String produtoR = ler.nextLine();
				if (estoque.contains(produtoR))
				{
					estoque.remove(produtoR);
				}
				else
				{
					System.out.println("\nProduto não existe dentro do estoque.");
				}
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que quer atualiza:");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o produto que irá entrar no lugar do produto: >"+verifica+"< :");
				String novo = ler.nextLine();
				
				if (estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe dentro do estoque.");
					
				}
				break;
				
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nFinalizou o programa!!!");
				break;
				default:
					System.out.println("Opção inválida!!!");
			}
			
		}
		while(op!=0);

	}

}
