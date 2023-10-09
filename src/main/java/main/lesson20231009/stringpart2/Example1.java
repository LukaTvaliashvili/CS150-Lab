package main.lesson20231009.stringpart2;

public class Example1 {
    public static void main(String[] args) {

        int x = 5;
        String s = String.valueOf(x); // represent int as String
        /*
        String class has multiple overloaded valueOf() methods:

        valueOf(int i)
        valueOf(long l)
        valueOf(float f)
        valueOf(char c)
        valueOf(double d) etc.

         */

        String hello = "Hello";
        String hello3Times = hello.repeat(3);
        System.out.println(hello3Times); // HelloHelloHello

        /*
        equals() is used to check for the equality of Strings
        if you use ==, then addresses in the memory will be compared
         */

        String str1 = "hello"; //saved in the String pool
        String str2 = new String("hello"); // new one is created, despite the same value being present in String pool
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); // false.  == is highlighted - IDE suggests not to use == with Strings


        /*
        From Java Documentation:
        When the intern method is invoked, if the pool already contains a string equal to this String object as
        determined by the equals(Object) method, then the string from the pool is returned.
        Otherwise, this String object is added to the pool and a reference to this String object is returned.
        It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
         */
        String intern = str2.intern();
        System.out.println(intern == str1); // true

        /*
        str2 was not present in the String pool before. We called intern() method on str2 on line 40.
        As str1 holding the same literal value as str2 was already present in the String pool, the one from the
        String pool was returned as indicated on line 36. As a result, both variables intern and str1 point to the
        same area in memory. Hence, the result true.
         */


    }
}
