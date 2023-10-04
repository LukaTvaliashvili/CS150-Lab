package main.lesson20231002.stringpart1;

public class Example4 {

    public static void main(String[] args) {

        String s1 = "Abracadabra";
        /*
        A b r a c a d a b r a
        0 1 2 3 4 5 6 7 8 9 10

        when working with substring() - [beginIndex, endIndex)
         */

        String substring = s1.substring(1); // returns substring starting the first character to the end
        System.out.println(substring); //bracadabra

        String substring1 = s1.substring(2, 9); //  r a c a d a b [9th character 'r' is not included]
        System.out.println(substring1);

        String substring2 = s1.substring(3, s1.length() + 5);
        System.out.println(substring2); // observe what happens. Why?
    }
}
