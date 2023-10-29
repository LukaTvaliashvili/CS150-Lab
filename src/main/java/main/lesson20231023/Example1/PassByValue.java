package main.lesson20231023.Example1;

public class PassByValue {

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("x before: " + x); //5
        System.out.println("y before: " + y); //6
        incrementAndAddNumbers(x, y);
        System.out.println("x after: " + x); // 6  or 5 ?
        System.out.println("y after: " + y); // 7 or 6 ?

    }

    public static int incrementAndAddNumbers(int a, int b) {
        a += 1;
        b += 1;
        return a + b;
    }
}
