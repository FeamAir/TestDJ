package com.hillel.lesson15;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testMain() {
    }
    @Test
    public void testCalculateAdd() {
        double actual = calculator.calculate(-5, "+", 0);
        Assert.assertEquals(-5, actual, 0.0);
    }
    @Test
    public void testCalculateSub() {
        double actual = calculator.calculate(2, "-", 4);
        Assert.assertEquals(2.0, actual, 0.0);
    }
    @Test
    public void testCalculateMul() {
        double actual = calculator.calculate(2, "*", 4);
        Assert.assertEquals(8.0, actual, 0.0);
    }
    @Test
    public void testCalculateDiv() {
        double actual = calculator.calculate(-2, "/", 2);
        Assert.assertEquals(-1.0, actual, 0.0);

    }
}