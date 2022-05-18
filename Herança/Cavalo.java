package Herança;

public class Cavalo extends Animal {
	
		private String paisDeOrigem;
		private String raca;
	
		public Cavalo(String nome, int idade, String paisDeOrigem, String raca) {
			super(nome,idade);
			this.paisDeOrigem = paisDeOrigem;
			this.raca = raca;
		}
	
		public void emitirSom() {
			System.out.println(this.getNome()+">>som de cavalo<<");
		}
	
		public void correr() {
			System.out.println("**correndo**");
		}

		public String paisDeOrigem() {
			return paisDeOrigem;
		}

		public void setPaisDeOrigem(String paisDeOrigem) {
			this.paisDeOrigem = paisDeOrigem;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}
}

