package com.heroku.cloudcalc;

import com.heroku.cloudcalc.Calculator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void shouldAdd2Numbers() throws Exception {
        calculator.add(1, 2);
        assertEquals("Incorrect addition", 3, calculator.getResult());
    }

    @Test
    public void shouldDeduct2Numbers() throws Exception {
        calculator.deduct(4, 1);
        assertEquals("Incorrect deduction", 3, calculator.getResult());
    }

    @Test
    public void shouldSquare() throws Exception{
        calculator.square(4);
        assertEquals("Incorrect square", 16, calculator.getResult());
    }

}
