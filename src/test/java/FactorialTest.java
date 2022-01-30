import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void FactorialOfOneIsOne() {
        Factorial factObj = new Factorial();
        int actualAns = factObj.findFactorial(1);
        int expectedAns = 1;
        assertEquals(actualAns, expectedAns);
    }

    @Test
    void FactorialOfTwoIsTwo() {
        Factorial factObj = new Factorial();
        int actualAns = factObj.findFactorial(2);
        int expectedAns = 2;
        assertEquals(actualAns, expectedAns);
    }

    @Test
    void FactorialOfFiveIsOneHundredTwenty() {
        Factorial factObj = new Factorial();
        int actualAns = factObj.findFactorial(5);
        int expectedAns = 120;
        assertEquals(actualAns, expectedAns);
    }
}
