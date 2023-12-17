package main.lesson20231211;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {7, 5, 2, 8, 9, 3};
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
