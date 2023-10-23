package main.lesson20231023.Example1;

public class ArrayExample1 {

    public static void main(String[] args) {
        /*
        [1, 2, 3]
            - strict type
            - fixed size
         */

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        int[] array1 = new int[]{1, 2, 3};

        for (int i = 0; i < array.length; i++) {
            System.out.println("for index " + i + ", value is: " + array[i]);
        }

        System.out.println("Reverse order");

        for (int i = array.length - 1; i >= 0; i--){
            System.out.println("for index " + i + ", value is: " + array[i]);

        }

        int[] array3 = new int[3]; // [0, 0, 0]
        for (int i=0; i < array3.length; i++){
            array3[i] = i + 2;
        }
        System.out.println(array3); // prints address in memory
        // [2, 3, 4]

        for (int i=0; i < array3.length; i++){
            System.out.println(array3[i]);
        }

        System.out.println("Enhanced for loop");

        for (int num : array3){
            System.out.println(num);
        }

    }
}
