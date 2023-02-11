package entity;

/**
 * A classe {@link SelectionSort} possui um método selectionSort que ordena um array de inteiros.
 * O método selectionSort implementa o algoritmo de ordenação por seleção.
 * A variável n é inicializada com o comprimento do array.
 * O laço for é executado n-1 vezes, já que cada iteração ordena um elemento do array.
 * Na primeira iteração, o índice minIndex é inicializado como i, que é o índice do primeiro elemento não ordenado.
 * O segundo laço for percorre a lista não ordenada a partir de i+1 até n para encontrar o menor elemento.
 * Se um elemento menor é encontrado, o índice desse elemento é armazenado em minIndex.
 * Depois de encontrar o menor elemento, ele é trocado com o primeiro elemento não ordenado.
 * O processo é repetido para cada elemento não ordenado.
 * 
 * @author Edielson Assis
 */
public class SelectionSort {

    /**
     * Metodo para ordenar o array
     * @param array
     */
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontra o menor elemento da lista não ordenada
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca o menor elemento encontrado com o primeiro elemento não ordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}