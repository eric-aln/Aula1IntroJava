package Herança;

public class Empregado1 extends Pessoa {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto)
	
	{
		super(nome,endereco,cpf,telefone,idade);
		this.codigoSetor=codigoSetor;
		this.salarioBase=salarioBase;
		this.imposto=imposto;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+" CPF: "+getCpf()+" idade: "+getIdade()+" telefone: "+getTelefone()+"\nEndereço: "+getEndereco()+
				"\n Codigo do setor: "+codigoSetor+"\nSalario base: "+salarioBase+" Valor em porcentagem (sem %) de imposto a ser retido do salario: "+imposto);
		
	}
	public void calcularSalario()
	{
		double salarioTotal = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salario total a ser recebido pelo empregado "+getNome()+"e o salario é: "+salarioTotal);
		
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

}
