package application;

import entity.BubbleSort;

public class App {
    public static void main(String[] args) {
        
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.bubbleSort(array);
        System.out.println("Array ordenado:");
        BubbleSort.printArray(array);
    }
}