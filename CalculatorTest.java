import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        // Test addition method
        assertEquals(8.0, Calculator.add(5.0, 3.0), 0.0);
    }

    @Test
    public void testSubtraction() {
        // Test subtraction method
        assertEquals(3.0, Calculator.subtract(5.0, 2.0), 0.0);
    }

    @Test
    public void testMultiplication() {
        // Test multiplication method
        assertEquals(12.0, Calculator.multiply(4.0, 3.0), 0.0);
    }

    @Test
    public void testDivision() {
        // Test division method
        assertEquals(3.0, Calculator.divide(6.0, 2.0), 0.0);
    }

    @Test
    public void testSquareRoot() {
        // Test square root method
        assertEquals(4.0, Calculator.squareRoot(16.0), 0.0);
    }

    @Test
    public void testFactorial() {
        // Test factorial method
        assertEquals(120, Calculator.factorial(5));
    }
}
