package entity;

/**
 * O algoritmo de {@link HeapSort} funciona da seguinte maneira: 
 * Primeiro, ele constrói um heap a partir do array desordenado. 
 * Em seguida, ele extrai um a um os elementos do heap e os coloca no final do array. 
 * O método heapify é usado para manter a propriedade de heap enquanto elementos são removidos.
 * 
 * @author Edielson Assis
 */
public class HeapSort {

    /** 
     * Metodo de ordenação
     * @param array
     */
    public static void sort(int[] array) {
        int n = array.length;

        // Construindo o heap (maior elemento no topo)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // Extrai um a um os elementos do heap
        for (int i = n - 1; i >= 0; i--) {
            // Move o root para o final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // chama o heapify no heap reduzido
            heapify(array, i, 0);
        }
    }

    /** 
     * Metodo de ajuste do heap
     * @param array
     * @param n
     * @param i
     */
    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // Se o filho esquerdo for maior que o pai
        if (l < n && array[l] > array[largest])
            largest = l;

        // Se o filho direito for maior que o pai
        if (r < n && array[r] > array[largest])
            largest = r;

        // Se o maior não for o pai
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursivamente ajusta o sub-heap
            heapify(array, n, largest);
        }
    }
}