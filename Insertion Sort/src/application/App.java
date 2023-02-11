package application;

import entity.InsertionSort;

public class App {
    public static void main(String[] args) {
        
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        InsertionSort.insertionSort(array);
        System.out.println("Array ordenado:");
        InsertionSort.printArray(array);
    }
}