package IOrdenacao;

public class MetodoSelectionSort implements Ordenacao {

	@Override
	public Double[] MetodoOrdenacao(Double[] vetor) {
        for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[menor]) {
                    menor = i;
                }
            }

            if (menor != fixo) {
            	Double t = vetor[fixo];
                vetor[fixo] = vetor[menor];
                vetor[menor] = t;
            }
        }

        return vetor;
	}

}
