package POOintro;

public class TesteAutomovel {

	public static void main(String[] args) {
		//instanciando em objeto da classe Automovel
		
		Automovel auto1 = new Automovel("Luciana Rocha","Mazda","LSD2019",2023);
		
		auto1.imprimirInfo();
		System.out.println("\n****Transferencia de Proprietarie****");
		auto1.setNomeProprietario("Tacio Ferreira");
		auto1.imprimirInfo();

	}

}
