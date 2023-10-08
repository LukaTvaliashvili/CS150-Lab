package main.lesson20231009.problems;

public class ConditionalProblemSet {

    public static void main(String[] args) {

    }

    /*
    oneOrTwoMoreThanMultipleOfTen(11) -> true
    oneOrTwoMoreThanMultipleOfTen(12) -> true
    oneOrTwoMoreThanMultipleOfTen(10) -> false
     */
    public static boolean oneOrTwoMoreThanMultipleOfTen(int input) {
        return true;
    }

    /*
    Time for a coffee break. Return bad, okay, or great.
    Coffee break was okay if both coffee and cake are at least 6.
    However, if either coffee or cake is at least twice the amount of the other one, the party is great.
    Finally, in all cases, if either coffee or cake is less than 6, the party is always bad.

    coffeeBreak(6, 8) → okay
    coffeeBreak(3, 8) → bad
    coffeeBreak(20, 6) → great
     */

    public static String coffeeBreak(int coffee, int cake) {

        return "";
    }

    /*
    You are driving and a police officer stops you.
    Write code to compute the result, encoded as an int value:
    0=no fine, 1=small fine, 2=big fine.
    If speed is 60 or less, the result is 0.
    If speed is between 61 and 80 inclusive, the result is 1.
    If speed is 81 or more, the result is 2.
     */

    public static int caughtSpeeding(int speed) {

        return 0;
    }

    /*
    return true if any of the two numbers is seven
    or their sum is seven
    or their difference is seven
    otherwise return false

    luckySeven(7, 4) → true
    luckySeven(4, 5) → false
    luckySeven(2, 5) → true
     */
    public static boolean luckySeven(int a, int b) {

        return false;
    }

    /*
    Given 2 ints, a and b, return their sum.
    However, sums in the range 11 to 20 inclusive, are forbidden, so in that case just return 20.

    sortaSum(3, 4) → 7
    sortaSum(9, 4) → 20
    sortaSum(10, 11) → 21
     */

    public int kidOfSum(int a, int b) {
        return 0;
    }

}
