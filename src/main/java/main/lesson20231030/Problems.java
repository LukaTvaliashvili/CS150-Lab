package main.lesson20231030;

import java.util.Arrays;

public class Problems {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateFromNtoOne(5)));
    }

    /*
    Given an array of ints,
    return a new array length 2 containing the first and last elements from the original array.
    The original array will be length 1 or more.
     */

    /*
    Given an array of integers, return the sum of all the elements in the array
     */

    /*
    Given an array of integers of length 3, find the largest of the first and the last element and
    set the rest of the elements to that value. Return the altered array. If this is too simple for you, try
    doing so for the array of the arbitrary length.
     */

    /*
    Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0.
    The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
     */

    /*
    When provided with a number between 0-9, return it in words.
    Input of 1 should return "One"
    Input of 2 should return "Two", etc.
    You are free to use switch statement. Can you try and solve it using arrays?
     */


    /*
    Build a function that returns an array of integers from 1 to n where n > 0.
    Example: n = 5 -> [1,2,3,4,5]

     */

    /*
    Build a function that returns an array of integers from n to 1 where n > 0.
    Example : n = 5 -> [5,4,3,2,1]
     */

    public static int[] generateFromNtoOne(int num){
        int[] result = new int[num];
        for(int i = 1; i <= num; i++){
            result[num - i] = i; // assign 1 to the last element
        }
        return result;
    }
}
