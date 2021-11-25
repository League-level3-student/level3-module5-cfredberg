package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(50, RecursionMath.recursiveMultiplication(25, 2));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(2, RecursionMath.recursiveDivision(14, 7));
    	assertEquals(10, RecursionMath.recursiveDivision(100000, 10000));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(16, RecursionMath.recursivePower(2, 4));
        assertEquals(64, RecursionMath.recursivePower(4, 3));
    }
}
