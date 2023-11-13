package main.lesson20231113;

public class ProblemSet {

    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(factorial(6)); // 720
        System.out.println(factorialRecursively(6));

    }

    /*
    Create a method that checks if the given word is a palindrome or not.
    A palindrome is a word or is sequence of characters that reads the
    same forward and backward. Here are some examples of palindromic words and phrases:

    Palindrome Words:

    radar
    level
    racecar
    refer

     */

    public static boolean isPalindrome(String str) {
        int middleIndex = str.length() / 2;
        for (int i = 0; i < middleIndex; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    /*
    Write a program to calculate the factorial of a given number.
    5! = 5 * 4 * 3 * 2 * 1
    5! = 5 * 4!
     */

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i; // result = result * i;
        }
        return result;
    }

    public static int factorialRecursively(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorialRecursively(n - 1);
    }

    /*
    Write a program to merge two arrays of the same size, sorted in ascending order.
    Test the program with relevant values.
     */

    /*
    Write a method that takes an int value and returns the number with its digits reversed.
    For example, given the number 7631, the method should return 1367
     */

    public static String intToReverseString(int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
//        return new StringBuilder().append(s).reverse().toString();
//        return new StringBuilder().append(num).reverse().toString();
    }
    /*
    Write a method that expects an argument of type integer and "Positive", "Negative", and "Zero" otherwise.
    Using this method check if the members of the given array, are positive, negative, or zero. Return a new array
    containing these values.
     */

    /*
    Create a method that calculates the value of a base raised to a positive integer exponent.
    i.e, you need to create your own version of Math.pow() method.
     */
}
