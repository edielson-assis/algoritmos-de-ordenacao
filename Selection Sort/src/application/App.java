package application;

import java.util.Arrays;

import entity.SelectionSort;

public class App {
    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11 };
        SelectionSort.selectionSort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}