package main.lesson20231218.miniExam.version1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VersionOneTest {

    @Test
    public void testRepeatEnd1() {
        assertEquals("llollollo", VersionOne.repeatLast("Hello", 3));
    }

    @Test
    public void testRepeatEnd2() {
        assertEquals("lolo", VersionOne.repeatLast("Hello", 2));
    }

    @Test
    public void testRepeatEnd3() {
        assertEquals("o", VersionOne.repeatLast("Hello", 1));
    }

    @Test
    public void testRepeatEnd4() {
        assertEquals("", VersionOne.repeatLast("Hello", 0));
    }

    @Test
    public void testRepeatEnd5() {
        assertEquals("HelloHelloHelloHelloHello", VersionOne.repeatLast("Hello", 5));
    }


    @Test
    public void testSquareBefore1() {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedArray = {1, 4, 9};
        assertArrayEquals(expectedArray, VersionOne.squareBefore(originalArray, 4));
    }

    @Test
    public void testSquareBefore2() {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedArray = {1, 4, 9, 16, 25};
        assertArrayEquals(expectedArray, VersionOne.squareBefore(originalArray, 5));
    }

    @Test
    public void testSquareBefore3() {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedArray = {1};
        assertArrayEquals(expectedArray, VersionOne.squareBefore(originalArray, 1));
    }

    @Test
    public void testCapitalizeEvenOdd1() {
        String input = "abcdef";
        String[] expected = {"AbCdEf", "aBcDeF"};
        assertArrayEquals(expected, VersionOne.capitalizeEvenOdd(input));
    }

    @Test
    public void testCapitalizeEvenOdd2() {
        String input = "helloworld";
        String[] expected = {"HeLlOwOrLd", "hElLoWoRlD"};
        assertArrayEquals(expected, VersionOne.capitalizeEvenOdd(input));
    }

    @Test
    public void testCapitalizeEvenOdd3() {
        String input = "java";
        String[] expected = {"JaVa", "jAvA"};
        assertArrayEquals(expected, VersionOne.capitalizeEvenOdd(input));
    }

    @Test
    public void testCapitalizeEvenOdd4() {
        String input = "programming";
        String[] expected = {"PrOgRaMmInG", "pRoGrAmMiNg"};
        assertArrayEquals(expected, VersionOne.capitalizeEvenOdd(input));
    }

    @Test
    public void testCapitalizeEvenOddWithEmptyString() {
        String input = "";
        String[] expected = {"", ""};
        assertArrayEquals(expected, VersionOne.capitalizeEvenOdd(input));
    }
}
