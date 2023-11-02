package main.lesson20231030.inclass;

public class Problems {

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 1, 2, 3};
        int[] arr1 = new int[5]; // [0,0,0,0,0]
//        printArray(arr1);
        // input [1,2,3] -> [0, 0, 0, 0, 0, 1]
        printArray(replaceLastElement(arr));
        System.out.println(findMax(arr)); // 3
        System.out.println(findMin(arr)); // 1
    }

    // shortcut to extract piece of code into a method: ctrl + alt + m
    // for variables: ctrl + alt + v
    private static void printArray(int[] arr1) {
        for (int num : arr1) {
            System.out.println(num);
        }
    }

    /*
    We have an array of integers of some arbitrary length.
    Let`s return a new array, which will be twice the size of the
    original array, and it will end with the first element of the
    original array. The rest, will be the default values.
     */

    public static int[] replaceLastElement(int[] arr) {
        int[] result = new int[arr.length * 2];
        result[result.length - 1] = arr[0];
        return result;
    }

    /*
    We have an array of integers.
    a) Find the largest element of the array.
    b) Find the smallest element of the array.
     */

    public static int findMax(int[] arr) {
        // int -> Integer
        //int max = Integer.MIN_VALUE; -> will not work as expected if array contains only negative values
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;

    }

    public static int findMin(int[] arr) {
//        int min = Integer.MAX_VALUE; -> will not work as expected if array contains only negative values
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;

    }

    /*
    how to sort the array in-place?

    [9, 5, -2, 11, 0, 7] -> [-2, 0, 5, 7, 9, 11]

    */
}
