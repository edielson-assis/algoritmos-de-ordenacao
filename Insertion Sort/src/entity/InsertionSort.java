package entity;

/**
* A classe {@link InsertionSort} contém o algoritmo de ordenação por inserção.
* O algoritmo de ordenação por inserção funciona da seguinte maneira:
* Ele começa pelo segundo elemento (índice 1) da lista e compara com o elemento anterior (índice 0).
* Se o elemento atual for menor que o elemento anterior, eles são trocados de posição.
* Este processo se repete até que todos os elementos anteriores tenham sido comparados e organizados.
* O algoritmo então passa para o próximo elemento e repete o processo.
* Este processo continua até que todos os elementos da lista estejam ordenados.
*
* @author Edielson Assis
*/
public class InsertionSort {

    /** 
     * Este é o algoritmo de ordenação Insertion Sort
     * @param array
     */
    public static void insertionSort(int[] array) {
        // Vamos percorrer o array, inserindo cada elemento na posição correta
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            // Enquanto a posição atual for maior que 0 e o elemento anterior for maior que o elemento atual
            while (j >= 0 && array[j] > key) {
                // Movemos o elemento anterior para a próxima posição
                array[j + 1] = array[j];
                j--;
            }
            // Inserimos o elemento na posição correta
            array[j + 1] = key;
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