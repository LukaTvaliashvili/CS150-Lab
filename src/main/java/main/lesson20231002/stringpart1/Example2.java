package main.lesson20231002.stringpart1;

public class Example2 {

    public static void main(String[] args) {

        String s1 = "Hello";

        String lowerCase = s1.toLowerCase();
        System.out.println(lowerCase); //useful when applying validation logic

        String upperCase = s1.toUpperCase();
        System.out.println(upperCase);

        /*
        H e l l o
        0 1 2 3 4
         */

        int length = s1.length(); // count starts from one, hence the value 5

        char c1 = s1.charAt(0);
        System.out.println(c1); //H
        char c2 = s1.charAt(4);
        System.out.println(c2); //o
        char c3 = s1.charAt(length - 1); // common way to refer to the last character in the given String
        System.out.println(c3); //o

        // what if we try to access the character which is beyond the length of the given String?
        char c = s1.charAt(10);
        System.out.println(c); // observe the message, name of the exception. Why is line 30 referenced?

    }
}
