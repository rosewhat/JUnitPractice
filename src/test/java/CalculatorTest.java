import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    public static Calculator calculator;
    private final double EPS = 1e-9;

    @BeforeClass
    public static void createNewCalculator() {
        calculator = new Calculator();
    }

    @Test(expected = ArithmeticException.class)
    public void checkSumValues() {
        int firstValue = 5;
        int secondValue = 5;
        int expected = 10;
        Assert.assertEquals(expected, calculator.sum(firstValue, secondValue), EPS);
    }

    @Test(expected = ArithmeticException.class)
    public void checkLengthValues() {
        int firstValue = 4;
        int secondValue = 3;
        int expected = 5;
        Assert.assertEquals(expected, calculator.sum(firstValue, secondValue), EPS);
    }



}
