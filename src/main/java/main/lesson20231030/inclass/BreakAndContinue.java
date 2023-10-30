package main.lesson20231030.inclass;

public class BreakAndContinue {

    public static void main(String[] args) {

        /*
        break vs continue
         */

        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

        // An example of a Label
        OUTER: for (int i = 0; i < 10; i++) {
            if (i == 5){
                break OUTER;
            }
            System.out.println(i);
        }

        System.out.println("=========================");
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }

        // return vs break?



    }
}
