package com.hillel.lesson15;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;

public class CalculatorTest extends TestCase {
    Calculator calculator;
    private final double a = 4.0;
    private final double b = 2.0;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    public void testMain() {
    }

    public void testCalculateAdd() {
        double actual = calculator.calculate(a, "+", b);
        Assert.assertEquals(6.0, actual, 0.0);
    }
    public void testCalculateSub() {
        double actual = calculator.calculate(a, "-", b);
        Assert.assertEquals(2.0, actual, 0.0);
    }
    public void testCalculateMul() {
        double actual = calculator.calculate(a, "*", b);
        Assert.assertEquals(8.0, actual, 0.0);
    }
    public void testCalculateDiv() {
        double actual = calculator.calculate(a, "/", b);
        Assert.assertEquals(2.0, actual, 0.0);

    }
}