package Main;

import IComportamentoVoo.NuncaVoar;
import IcomportamentoSom.EmitirSomArtificial;
import model.PatoMadeira;

public class App {

	public static void main(String[] args) {
		PatoMadeira patoMadeira = new PatoMadeira();
		NuncaVoar nV = new NuncaVoar();
		EmitirSomArtificial eSA = new EmitirSomArtificial();
		patoMadeira.cS = eSA;
		patoMadeira.cV = nV;
		patoMadeira.cV.Voar();
		patoMadeira.cS.EmitirSom();
	}
}
