package academy.mischok;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("3 - 1 = 2")
    void testDifferenceFunktion() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.subtract(3, 1), "3 - 1  should equal 2");
    }

    @Test
    @DisplayName("3 + 3 = 6")
    void testSumFunction() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(6, calculator.add(3,3), "3 + 3 should equal 6");
    }

    @Test
    @DisplayName("4 * 2 = 8")
    void testMultiplyFunction() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(8, calculator.multiply(4, 2), "4 * 2 should equal 8");
    }

    @Test
    @DisplayName("10 / 5 = 2")
    void testDivideFunction() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.divide(10, 5), "10 / 5 should equal 2");
    }
    @Test
    @DisplayName("3 / 0")
    void testDivisionByZero() {

        SimpleCalculator calculator = new SimpleCalculator();
        //assertThrows(IllegalArgumentException.class, () -> calculator.divide(3, 0), "Expected IllegalArgumentException when dividing by zero");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(3, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
