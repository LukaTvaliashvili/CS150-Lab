package main.lesson20231002;

public class preAndPostIncrement {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("Using i++ (Post-increment):");
        System.out.println("Initial value of i: " + i);
        int result1 = i++;
        System.out.println("Value after i++: " + i);
        System.out.println("Result of i++: " + result1);

        System.out.println("Using ++i (pre-increment):");
        System.out.println("Initial value of i: " + i);
        int result2 = ++i;
        System.out.println("Value after i++: " + i);
        System.out.println("Result of i++: " + result2);

    }
}
