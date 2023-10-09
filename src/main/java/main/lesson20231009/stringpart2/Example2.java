package main.lesson20231009.stringpart2;

public class Example2 {

    public static void main(String[] args) {

        String s1 = " ";

        System.out.println(s1.isBlank()); // true
        System.out.println(s1.isEmpty()); // false

        /*
        isEmpty() returns true if length is 0
        isBlank() returns true if String is empty or contains only whitespace
         */

        String hello = "Hello";

        String indented = hello.indent(5);
        //indented with 5 whitespace characters, followed by \n - new line
        System.out.println(indented);

        /*
        If we want to get rid of whitespaces from the String, we use strip() method
         */

        String indentationRemoved = indented.strip();
        System.out.println(indentationRemoved);

    }
}
