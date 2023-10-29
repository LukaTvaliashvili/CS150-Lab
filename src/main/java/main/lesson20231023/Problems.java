package main.lesson20231023;

public class Problems {

    public static void main(String[] args) {
        int[] array = new int[] {2,3,4};
        int luckyNum = 2;
        boolean containsLuckyNumber7 = firstOrLast(new int[]{4,5,6}, 7); // false
        System.out.println(containsLuckyNumber7); //false
        System.out.println(firstOrLast(array, luckyNum)); // true
    }

    /*
    Given an int array length 2, return true if it does not contain a 7 or 9.

    notContains7Or9([4, 5]) → true
    notContains7Or9([4, 7]) → false
    notContains7Or9([9, 5]) → false
     */

    public static boolean notContains7Or9(int[] array) {
        return false;
    }


    /*
    Given an array of ints, return true if luckyNumber appears as either the first or last element in the array.
    The length of the array will be 1 or more.
     */

    public static boolean firstOrLast(int[] array, int luckyNumber) {
        if (array[0] == luckyNumber || array[array.length - 1] == luckyNumber) {
            return true;
        }
        return false;
    }

    /*
    Given an array of ints of even length, return a new array length 2 containing the middle
    two elements from the original array. The original array will be length 2 or more.

    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]

     */

    public static int[] makeMiddle(int[] array) {

        return new int[]{};
    }


    /*
    Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
    The array length will be at least 3.

    extractMidElements([1, 2, 3, 4, 5]) → [2, 3, 4]
    extractMidElements([2, 4, 7, 7, 3, 0, 9]) → [7, 7, 3]
    extractMidElements([1, 2, 3]) → [1, 2, 3]
     */

    public static int[] extractMidElements(int[] array) {

        return new int[]{};

    }

    /*
    Let`s consider the case when 1 is immediately followed by 3 as unlucky.
    Return true if the given array contains unlucky number in the first two, or last two positions of the input array.

    hasUnlucky13([2, 1, 3, 4, 5]) → false
    hasUnlucky13([1, 3, 4, 5]) → true
    hasUnlucky13([1, 1, 1]) → false
    */

    public boolean hasUnlucky13(int[] array) {

        return false;
    }


    /*
    Given 2 arrays of ints, a and b, return true if they have the same first or the last element.
    Both arrays will be length 1 or more.
     */

    public static boolean commonBeginningOrEnd(int[] a, int[] b) {

        return true;
    }

    /*
    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

    extractMiddleElements([1, 2, 3], [4, 5, 6]) → [2, 5]
    extractMiddleElements([9, 9, 9], [2, 9, 0]) → [9, 9]
    extractMiddleElements([1, 4, 5], [5, 2, 9]) → [4, 2]
     */

    public static int[] extractMiddleElements(int[] a, int[] b) {

        return new int[]{};
    }

    /*
    Given an int array length 3, if there is a 4 in the array immediately followed by a 5, set the 5 element to 0.
    Return the changed array.

    replaceIf4IsFollowedBy5([1, 4, 5]) → [1, 4, 0]
    replaceIf4IsFollowedBy5([4, 5, 6]) → [4, 0, 6]
    replaceIf4IsFollowedBy5([1, 2, 3]) → [1, 2, 3]

     */

    public static int[] replaceIf4IsFollowedBy5(int[] array) {

        return new int[]{};
    }


    /*
    Given an input array, return a reversed version
    example: reverseArray(new int[]{1,2,3}) -> [3,2,1]
     */
    public static int[] reverseArray(int[] array) {

        return new int[]{};
    }
}
