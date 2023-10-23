package main.lesson20231023.Example1;

public class PassByReference {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println("Before processing:");
        printArray(arr); // [1,2,3]
        processArray(arr);
        System.out.println("After processing:");
        printArray(arr); // [9,2,3] -> Pass by reference
    }

    public static void processArray(int[] arr) {
        int[] array = new int[arr.length];
        array = arr;
        array[0] = 9;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }


}


