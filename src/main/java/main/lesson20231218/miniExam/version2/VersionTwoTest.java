package main.lesson20231218.miniExam.version2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VersionTwoTest {

    @Test
    public void testCountOccurrences1() {
        assertEquals(1, VersionTwo.countOccurrences("abc hi ho", "hi"));
    }

    @Test
    public void testCountOccurrences2() {
        assertEquals(2, VersionTwo.countOccurrences("ABChi hi", "hi"));
    }

    @Test
    public void testCountOccurrences3() {
        assertEquals(3, VersionTwo.countOccurrences("hihihi", "hi"));
    }

    @Test
    public void testCountOccurrences4() {
        assertEquals(0, VersionTwo.countOccurrences("No occurrences here", "hello"));
    }

    @Test
    public void testCountOccurrences5() {
        assertEquals(3, VersionTwo.countOccurrences("hi hi hi", "hi"));
    }

    @Test
    public void testSumAdjacentElements1() {
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] expectedArray = {3, 5, 7, 9, 11, 6};
        assertArrayEquals(expectedArray, VersionTwo.sumAdjacentElements(inputArray));
    }

    @Test
    public void testSumAdjacentElements2() {
        int[] inputArray = {5, 10, 15, 20};
        int[] expectedArray = {15, 25, 35, 20};
        assertArrayEquals(expectedArray, VersionTwo.sumAdjacentElements(inputArray));
    }

    @Test
    public void testSumAdjacentElements3() {
        int[] inputArray = {-1, 0, 1, 2, 3};
        int[] expectedArray = {-1, 1, 3, 5, 3};
        assertArrayEquals(expectedArray, VersionTwo.sumAdjacentElements(inputArray));
    }

    @Test
    public void testSumAdjacentElementsWithSingleElement() {
        int[] inputArray = {42};
        int[] expectedArray = {42};
        assertArrayEquals(expectedArray, VersionTwo.sumAdjacentElements(inputArray));
    }

    @Test
    public void testSumAdjacentElementsWithEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};
        assertArrayEquals(expectedArray, VersionTwo.sumAdjacentElements(inputArray));
    }

    @Test
    public void testConcatenateEvenOdd1() {
        String inputString = "abcdefgh";
        String expectedOutput = "acegbdfh";
        assertEquals(expectedOutput, VersionTwo.concatenateEvenOdd(inputString));
    }

    @Test
    public void testConcatenateEvenOdd2() {
        String inputString = "xyz12345";
        String expectedOutput = "xz24y135";
        assertEquals(expectedOutput, VersionTwo.concatenateEvenOdd(inputString));
    }

    @Test
    public void testConcatenateEvenOdd3() {
        String inputString = "JavaIsFun";
        String expectedOutput = "JvIFnaasu";
        assertEquals(expectedOutput, VersionTwo.concatenateEvenOdd(inputString));
    }

    @Test
    public void testConcatenateEvenOddWithSingleCharacter() {
        String inputString = "a";
        String expectedOutput = "a";
        assertEquals(expectedOutput, VersionTwo.concatenateEvenOdd(inputString));
    }

    @Test
    public void testConcatenateEvenOddWithEmptyString() {
        String inputString = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, VersionTwo.concatenateEvenOdd(inputString));
    }

}
