package main.lesson20231002.stringpart1;

public class Example1 {

    public static void main(String[] args) {
        /*
        Strings are immutable - once created it can no longer be altered
         */

        String s1 = "Hello";
        System.out.println(s1); //Hello
        s1.concat(" there!");
        System.out.println(s1); // what will be printed on the console?

        /*
        Under the hood, new String will be created on line 12 but unless we explicitly save the reference
        to this newly created String, the result of s1.concat() operation will be ignored.
        i.e. s1 will not be altered - immutable
         */

        String s2 = s1.concat(" there!");
        System.out.println(s2); // Hello there!
    }
}
