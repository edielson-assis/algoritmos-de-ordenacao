package application;

import java.util.Arrays;

import entity.MergeSort;

public class App {
    public static void main(String[] args) {

        int[] array = {38, 27, 43, 3, 9, 82, 10};    
        MergeSort.sort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }    
}