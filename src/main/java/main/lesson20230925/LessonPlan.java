package main.lesson20230925;

public class LessonPlan {
    public static void main(String[] args) {
        System.out.println(add(5, 5));
       /*
       Portability?
       Access modifiers?
            - public
            - private
            - protected
            - default

       Naming convention for identifiers - camelCase
            -restrictions
            -camel case

       Primitives & Type casting

       byte
       short
       int
       long

       float - 3.2313121251512512  - 32bits
       double - 3.23131212515125122313121251512512   64bits

       char

       boolean - true / false

       Comments

       Escape characters

       Stack - LIFO(Last In, First Out) and Heap Memory


        */

        char a = 'a';
        char aNumeric = 97;
        char copyRight = 169;

        System.out.println(a);
        System.out.println(aNumeric);
        System.out.println(copyRight);

        /*
        Naming convention:
        Uppercase/lowercase letters
        $
        _
        numbers (cannot start with number)
         */

        int _num1 = 3;
        int $_num2 = 4;



    }

    public static int add(int a, int b){
        return a + b;
    }
}
