package POOintro;

public class Cliente {
	
	/*/1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	//declaração dos atributos da classe
	
	private String nome;
	private int debito;
	
	//declaração do metodo construtor
	
	public Cliente(String nome, int debito)
	{
		this.nome = nome;
		this.debito = debito;
	}
	//declaração dos demais metodos da classe
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do proprietárie: "+nome+", possui um debito no valor de: "+debito);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDebito() {
		return debito;
	}

	public void setDebito(int debito) {
		this.debito = debito;
	}
	public void descontoDebito(double percentual)
	{
		debito *= 1 - percentual / 100;
	}
	
	}
	
	
	/*public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}

	//declaração dos demais metodos da classe
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cliente: %s "+nome+,"Valor debito: %d"+debito);
	}
	public void setDebito(Double parcelar);
	{
		debito = debito / 3;
		
	}

}*/

/*public class Empregado {

	private String nome;
	private double salario;
	
	public Empregado(String n, double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println("\n"+nome+"\t\tSalário: "+this.formatarMoeda());
	}
	
}
*/
