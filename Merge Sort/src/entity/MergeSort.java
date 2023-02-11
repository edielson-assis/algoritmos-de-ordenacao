package entity;

/**
 * A classe {@link MergeSort} possui dois metodos: sort e merge.
 * O metodo sort é o metodo principal que implementa o algoritmo de ordenação. 
 * Ele tem como parâmetros um array 'arr' e dois índices 'l' e 'r' que indicam o intervalo do array que deve ser ordenado.
 * O metodo sort verifica se 'l' é menor que 'r'. 
 * Se for, ele divide o problema em duas partes iguais, uma para o intervalo [l, m] e outra para o intervalo [m + 1, r]. 
 * 'm' é calculado como a média de 'l' e 'r'.
 * O metodo "merge" é um metodo privado, e é responsável por mesclar as duas metades já ordenadas do array.
 * 
 * @author Edielson Assis
 */
public class MergeSort {

    /** 
     * Método principal que ordena o array
     * @param arr
     * @param l
     * @param r
     */
    public static void sort(int[] arr, int l, int r) {
        // Verifica se o índice da esquerda é menor do que o da direita
        if (l < r) {
            // Calcula o ponto médio do array
            int m = (l + r) / 2;

            // Divide o array em duas metades
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Junta as duas metades de forma ordenada
            merge(arr, l, m, r);
        }
    }

    /** 
     * Método auxiliar que junta as duas metades de forma ordenada
     * @param arr
     * @param l
     * @param m
     * @param r
     */
    private static void merge(int[] arr, int l, int m, int r) {
        // Calcula o tamanho das duas metades
        int n1 = m - l + 1;
        int n2 = r - m;

        // Cria arrays temporários para armazenar as duas metades
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copia os elementos da primeira metade para o array temporário left
        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        // Copia os elementos da segunda metade para o array temporário right
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];

        // Variáveis auxiliares para percorrer os arrays left e right
        int i = 0; 
        int j = 0;
        // Variável para percorrer o array original arr
        int k = l;

        // Enquanto houverem elementos em ambos os arrays temporários
        while (i < n1 && j < n2) {
            // Verifica qual elemento é menor e o adiciona ao array original arr
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Adiciona os elementos restantes do array temporário left ao array original arr
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Adiciona os elementos restantes do array temporário right ao array original arr
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}