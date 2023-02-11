package application;

import java.util.Arrays;

import entity.HeapSort;

public class App {
    public static void main(String[] args) {

        int[] array = { 12, 11, 13, 5, 6, 7 };
        HeapSort.sort(array);
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(array));
    }
}