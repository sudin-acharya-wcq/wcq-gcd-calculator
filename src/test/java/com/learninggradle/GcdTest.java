package com.learninggradle;


import com.learninggradle.businesslogic.GcdCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest {

    @Test
    public void testGcd(){

        assertEquals(4, GcdCalculator.gcdArray(new int[] {4})); //Testing with 1 integer
        assertEquals(1, GcdCalculator.gcdArray(new int[] {2, 3})); //Testing with set of 2 integers
        assertEquals(5, GcdCalculator.gcdArray(new int[] {5, 10, 15})); //Testing with set of 3 integers
        assertEquals(1, GcdCalculator.gcdArray(new int[] {2, 3, 5, 7})); //Testing with set of 4 integers
        assertEquals(-4, GcdCalculator.gcdArray(new int[] {-4, -8, -20})); // Testing with negative numbers
        assertEquals(2, GcdCalculator.gcdArray(new int[] {-4, 10, -12, 20})); // Testing with negative and positive numbers
    }

}
