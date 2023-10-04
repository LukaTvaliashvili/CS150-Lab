package main.lesson20231002.stringpart1;

public class Example3 {

    public static void main(String[] args) {

        String s1 = "Hello";

        /*
        H e l l o
        0 1 2 3 4
         */

        int index1 = s1.indexOf('H');
        int index2 = s1.indexOf("H");
        //accepts either char or String -> an example of method overloading
        System.out.println(index1); // 0

        int index = s1.lastIndexOf('l'); //takes either char or String as a parameter
        System.out.println(index); //3

        String s2 = "Abracadabra";
        /*
        A b r a c a d a b r a
        0 1 2 3 4 5 6 7 8 9 10
         */
        int index3 = s2.indexOf("a", 2);
        //retrieve the index of the first occurrence of a, starting index 2 [included]
        System.out.println(index3); // 3
        int index4 = s2.indexOf('a', 12);
        System.out.println(index4); // in case the given char or String is not found -1 is returned

        int index5 = s2.lastIndexOf("a", 8);
        //find the index of the last occurrence of "a", from the start of the string to the provided value
        System.out.println(index5); //7
    }
}
