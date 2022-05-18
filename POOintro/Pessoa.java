package POOintro;

public class Pessoa {
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//construtor para executar um procedimento, o construtor nome esta instanciando os atributos

	public Pessoa (String primeiro, String meio, String ultimo)
	{
		primeiroNome=primeiro;
		ultimoNome=ultimo;
		nomesDoMeio=meio;
		
	}
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
	
}
