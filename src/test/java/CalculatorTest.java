import com.devOps.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.add(3, 2);
        assertEquals(5, result, "3 + 2 should equal 5");
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(5, 3);
        assertEquals(15, result, "5 * 3 should equal 15");
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(15, 5);
        assertEquals(3, result, "15 / 5 should equal 3");
    }
}
