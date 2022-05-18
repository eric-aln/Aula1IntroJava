package POOintro;

public class ExercicioCliente {

	public static void main(String[] args) {
	//instanciando em objeto da classe Automovel
			
		Cliente cliente1 = new Cliente("Luciana Rocha",250);
			
		cliente1.imprimirInfo();
		System.out.println("\n****Desconto do debito****");
		cliente1.descontoDebito(10);
		cliente1.imprimirInfo();

		}

	}
