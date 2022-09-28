package IOrdenacao;

public class MetodoInsertionSort implements Ordenacao {

	@Override
	public Double[] MetodoOrdenacao(Double[] vetor) {
        int j, i;
        Double aux;
        
        for (j = 1; j < vetor.length; j++) {
            aux = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > aux); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = aux;
        }
        return vetor;
	}
}
