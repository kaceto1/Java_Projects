package com.java24hours;

public class MySelectionSort {
    static int min = 0;
    static int temp = 0;
    static int count = 0;
    
    public static void main (String[] arguments) {
        int[] array = {9, 1, 5, 7, 2, 4, 3, 6, 8};
        
        selectionSort(array);
        
        for (int i : array) {
            System.out.print(i + "");
        }
        
        System.out.println();
    }
    
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    
}
