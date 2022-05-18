package Colecao;

public class Excecao1 {
	public static void main(String[] args){

	String frase = null;
	String novaFrase = null;
	
	try
	{
		novaFrase = frase.toUpperCase();
	}
	catch(NullPointerException e) //captura da possivel exceção
	{
		//tratamento da exceção
		System.out.println("\n A frase inicial está nula, para solucionar foi lhe atribuido um valor default");
		frase = "Frase vazia...";
		novaFrase = frase.toUpperCase();
	}
	System.out.println("\nAntiga: "+frase);
	System.out.println("\nNova frase: "+novaFrase);

	
	
	}
}