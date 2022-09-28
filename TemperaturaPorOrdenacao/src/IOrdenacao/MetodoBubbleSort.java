package IOrdenacao;

public class MetodoBubbleSort implements Ordenacao{
	
	@Override
	public Double[] MetodoOrdenacao(Double[] vetor) {
		boolean troca = true;
        double aux;

        while (troca) {
            troca = false;

            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return vetor;
	}

}
