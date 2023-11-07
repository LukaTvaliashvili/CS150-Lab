package main.lesson20231105;

import java.util.Arrays;

public class ProblemSet {

    public static void main(String[] args) {
//        System.out.println(arrayToString(new int[]{1, 2, 3, 4}));
//        System.out.println(mutableArrayToString(new int[]{1, 2, 3, 4}));
//        System.out.println(catDog("catdog"));// true
//        System.out.println(catDog("catcat")); //false
//        System.out.println(catDog("1cat1cadodog")); //true

        System.out.println(reverse("ABC"));
        printArray(reverseArrayElements(new String[]{"Hello", "World"}));

        System.out.println("\n");
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.reverse());

    }

    public static void printArray(String[] arr) {
        for (String var : arr) {
            System.out.print(var + " ");
        }
    }

    /*
    Given an array of integers, return a string containing all the members of the
    original array, separated by comma.

    [1, 2, 3, 4] - > "1,2,3,4"
     */

    public static String arrayToString(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length - 1; i++) {
            result += arr[i] + ", ";
            // result = result + arr[i] + ", "
        }
        // we have all the elements separated by comma, except the last element
        result += arr[arr.length - 1]; // assign the last element separately
        return result;
    }

    public static String mutableArrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i] + ", ");
//            StringBuilder intermediate = sb.append(arr[i]);
//            intermediate.append(", ");
//            sb.append(arr[i]).append(","); // method chaining
        }
        // we have all the elements separated by comma, except the last element
        sb.append(arr[arr.length - 1]); // assign the last element separately
        return sb.toString();

    }

    /*
    Given a non-empty array of integers, return a new array containing the elements that
    follow the last occurrence of element 4. The original array will contain at least one 4.

    ([4, 1, 4, 2]) -> [2]
     */

    /*
    Given an array of integers, return an array in which all the 9s are removed.
    The remaining elements should be shifted left, towards the beginning of the array.

    {1, 9, 9, 2} -> {1, 2, 0, 0}.

     */

    /*
    Given an array of Strings, return a new array in which each String is reversed.


    ["hello", "world"] -> ["olleh", "dlrow"]
     */
    public static String[] reverseArrayElements(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = reverse(arr[i]);
        }
        return result;

    }

    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
    /*
    We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array
    at least one of the pair is that value. Return true if the given value is everywhere in the array.

   ([1, 2, 1, 3], 1) -> true
   ([1, 2, 1, 3], 2) -> false

    */

    /*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") -> true
    catDog("catcat") -> false
    catDog("1cat1cadodog") -> true
     */

    public static boolean catDog(String input) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < input.length() - 2; i++) {
            if (input.toLowerCase().substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (input.toLowerCase().substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }


    /*
    Return the number of times that the string "hi" appears anywhere in the given string.

    ("hihi") -> 2
    ("dce hi ho") -> 1
    ("XYZhi hi") -> 2

     */

    /*
    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

    sameStarChar("xy*yzz") -> true
    sameStarChar("xy*zzz") -> false
    sameStarChar("*xa*az") -> true
    sameStarChar("*12*2*2") -> true
    sameStarChar("12*2*3*") -> false
     */


}
