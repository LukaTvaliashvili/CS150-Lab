package main.lesson20231113;

public class ExamReview {

    public static void main(String[] args) {
        String s1 = "Kool and the Gang";
        // "K o o l   a n d t h e Gang";
        //  0 1 2 3 4 5 6 7
        System.out.println(s1.substring(3, 9)); // [3, 9)

        /*
        if
        else if
        else
         */

        int[] arr = new int[]{1, 2, 3, 4};
        int len = arr.length; // 4

        int[] arr1 = new int[5]; // [0, 0, 0, 0, 0]
        double[] doubles = new double[5]; // [0.0, 0.0, 0.0, 0.0, 0.0]
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 3};
        int arr4[] = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 3};

        int x = 10;
        int y = 13;
        y++;
        // 14
        ++y; //15
        int result = x++ + ++x + y; // 10 + 12 + 15
        System.out.println("x: " + x + " y: " + y);
        System.out.println(result);

        // x++ same as x = x + 1 or x += 1
        /*

        x *= 5;
        x -= 10;

         */


        int z = 20;
        while (z <= 200) {
            z += 20;
        }

        // how many times will the loop iterate?

        int count = 3;
        switch (count) {
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
            case 4:
                System.out.println("Four");
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Some value");
        }

        for (int i = 2; i <= 11; ++i) {
            System.out.println(i);
        }

//        String[] array;
//        array = {"hello", "there"}; // will not compile, needs to be initialized


    }
}
