package Herança;

public class Preguica extends Animal{
		
		private String especie;
		
		public Preguica(String nome, int idade,String especie) {
			super(nome,idade);
			this.especie = especie;
		}
		
		public void emitirSom() {
			System.out.println(this.getNome()+">>som de preguiça<<");
		}
		
		public void subirArvore() {
			System.out.println("**subindo na árvore**");
		}

		public String getEspecie() {
			return especie;
		}

		public void setEspecie(String especie) {
			this.especie = especie;
		}
}
