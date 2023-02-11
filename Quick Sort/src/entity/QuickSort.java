package entity;

/**
 * {@link QuickSort} é um algoritmo de ordenação de divide-e-conquista 
 * que escolhe um elemento pivot e particiona os elementos em duas partes baseadas na comparação com o pivot. 
 * A partição é repetida recursivamente até que todos os elementos estejam ordenados.
 * 
 * @author Edielson Assis
 */
public class QuickSort {

    /** 
     * Método de ordenação
     * @param array
     * @param inicio
     * @param fim
     */
    public static void quickSort(int[] array, int inicio, int fim) {
        // verifica se o intervalo é válido
        if (inicio < fim) {
            // obtém o índice do pivô e divide o array em duas partes
            int posicaoPivo = particiona(array, inicio, fim);
            // ordena a parte esquerda do pivô
            quickSort(array, inicio, posicaoPivo - 1);
            // ordena a parte direita do pivô
            quickSort(array, posicaoPivo + 1, fim);
        }
    }
 
    /** 
     * Método que divide o array a partir do pivô
     * @param array
     * @param inicio
     * @param fim
     * @return int
     */
    private static int particiona(int[] array, int inicio, int fim) {
        // define o pivô como o último elemento do array
        int pivo = array[fim];
        // índice do menor elemento
        int i = inicio - 1;
        // percorre o array do início ao fim
        for (int j = inicio; j <= fim - 1; j++) {
            // se o elemento atual for menor ou igual ao pivô
            if (array[j] <= pivo) {
                // aumenta o índice do menor elemento
                i++;
                // troca o elemento atual com o elemento no índice i
                troca(array, i, j);
            }
        }
        // coloca o pivô na posição correta
        troca(array, i + 1, fim);
        // retorna a posição do pivô
        return i + 1;
    }

    /** 
     * Método que troca dois elementos de posição no array
     * @param array
     * @param i
     * @param j
     */
    private static void troca(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}