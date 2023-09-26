package main.lesson20230925;

public class Example2 {

    public static void main(String[] args) {

        double d1 = 32.2d;
        double d2 = 20.3d;

//        float f1 = 21.1f;  // double as default [cast it or add f]

        double sum = d1 + d2;
        System.out.println(sum); // 52.5;

        // 52
        // either explicitly  cast each of the operands
        // or cast the value of the expression [sum]

        System.out.println(((int) d1 + (int)d2)); // 52
        System.out.println((int) sum); // 52

    }
}
