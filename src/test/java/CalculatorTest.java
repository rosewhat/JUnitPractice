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

    @Test
    public void checkSumValues() {
        int firstValue = 5;
        int secondValue = 5;
        int expected = 10;
        Assert.assertEquals(expected, calculator.sum(firstValue, secondValue), EPS);
    }

    @Test
    public void checkLengthValues() {
        int firstValue = 4;
        int secondValue = 3;
        int expected = 25;
        Assert.assertEquals(expected, calculator.length(firstValue, secondValue), EPS);
    }

    @Test
    public void checkDivideValues() {
        int firstValue = 12;
        int secondValue = 3;
        int expected = 4;
        Assert.assertEquals(expected, calculator.divide(firstValue, secondValue), EPS);
    }

    @Test
    public void checkDensityValues() {
        int firstValue = 10;
        int secondValue = 5;
        int expected = 2;
        Assert.assertEquals(expected, calculator.density(firstValue, secondValue), EPS);
    }







}
