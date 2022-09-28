package heranca.simuladorpatos;

public class Main {

	
	public String getTipoPato (Pato p) {
		
		if (p instanceof PatoBravo) {	
			return "Pato Bravo";
		} else {
			if (p instanceof PatoCabecaVermelha) {
				return "Pato Cabeça Vermelha";
			} else {
				if (p instanceof PatoMadeira)
				return "Pato Madeira";
			}
			return "Pato Genérico";
		}
		
	}
	
	public static void main (String[] args) {
		
		Main m = new Main();
		Pato p = new Pato();
		System.out.println(m.getTipoPato(p));
		p.emitirSom();
		p.exibir();
		p.voar();
		
		System.out.println("-----------------");
		p = new PatoBravo();
		System.out.println(m.getTipoPato(p));
		p.emitirSom();
		p.exibir();
		p.voar();
		
		System.out.println("-----------------");
		p = new PatoMadeira();
		System.out.println(m.getTipoPato(p));
		p.exibir();
		p.voar();
		
	}
	
}
