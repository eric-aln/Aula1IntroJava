package Herança;

public class Cachorro extends Animal {
		
		private String corDoPelo;
		private String raca;
		
		public Cachorro (String nome, int idade, String corDoPelo, String raca) {
			super(nome,idade);
			this.corDoPelo = corDoPelo;
			this.raca = raca;
		}
		
		public void emitirSom() {
			System.out.println(this.getNome()+">Au! Au! Au!<");
		}
		
		public void correr() {
			System.out.println("**correndo**");
		}

		public String getCorDoPelo() {
			return corDoPelo;
		}

		public void setCorDoPelo(String corDoPelo) {
			this.corDoPelo = corDoPelo;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}
}
