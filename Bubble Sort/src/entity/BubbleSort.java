package entity;

/**
 * A classe {@link BubbleSort} ordena um array de números inteiros usando o algoritmo Bubble Sort. 
 * Ela possui os metodos: bubbleSort e printArray. 
 * O método bubbleSort contém os passos do algoritmo e o método printArray imprime o array ordenado. 
 * O algoritmo funciona comparando cada par de elementos adjacentes no array e trocando-os se necessário até que todos os elementos estejam ordenados em ordem crescente.
 * 
 * @Author Edielson Assis
 */
public class BubbleSort {
    
    /** 
     * Método de ordenação Bubble Sort
     * @param array
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp;

        // Loop para percorrer todo o array
        for (int i = 0; i < n - 1; i++) {
            // Loop para comparar os elementos adjacentes e trocá-los se necessário
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos de posição
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /** 
     * Método para imprimir o array
     * @param array
     */
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) 
            System.out.print(array[i] + " ");
        System.out.println();
    }
}