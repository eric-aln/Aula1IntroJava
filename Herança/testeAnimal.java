package Herança;

public class testeAnimal {
	
public static void main(String[]args) {
		
		Animal doguinho = new Cachorro("Totó",8,"Caramelo","Vira-lata");
		Animal cavalo = new Cavalo("Speed",6,"Alemanha","Puro Sangue Ingles");
		Animal preguica = new Preguica ("Gloria",2,"Bicho-preguiça");
		
		doguinho.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
	}

}
