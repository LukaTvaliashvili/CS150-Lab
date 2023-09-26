package main.lesson20230925;

public class Example1 {

    public static void main(String[] args) {
        int num1 = 2;
//        int num1 - cannot use same identifier in one scope

        /*
        +
        -
        /
        *
        %
         */

        int a = 5;
        int b = 2;

        System.out.println(a / b); // 2
        System.out.println(a % b); // 1

        byte m = 10;
        int n = 10;

        int k = m;
        m = (byte) n;

//        System.out.println((double) a / b); // 2.5
//        System.out.println(a / (float) b);


        double d1 = 32d;
        double d2 = 32d;
        System.out.println(d1);
        System.out.println(d2);

        float f1 = 19;
        float f2 = 19f;
        System.out.println(f1);
        System.out.println(f2);



    }
}
