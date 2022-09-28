package heranca.simuladorpatos;

public class PatoMadeira extends Pato {

	public void exibir() {
		System.out.println("Sou um pato de madeira!");
	}
	
	@Override public void voar () {
		System.out.println("O pato não está voando...");
	}
}
