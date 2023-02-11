package application;

import java.util.Arrays;

import entity.QuickSort;

public class App {
    public static void main(String[] args) {

        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}