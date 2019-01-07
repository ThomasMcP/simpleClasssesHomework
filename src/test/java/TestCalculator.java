import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator();}

    @Test
    public void hasTotalZero(){
        assertEquals(0, calculator.getTotal());
    }

    @Test
    public void canAddTwoNumbers(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtractTwoNumbers(){
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    public void canMultiplyTwoNumbers(){
        assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    public void canDivideTwoNumbers(){
        assertEquals(2, calculator.divide(4, 2));
    }




}
