package com.hillel.lesson15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;


    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testCalculateAdd() {
        double actual = calculator.calculate(5, "+", 2);
        Assert.assertEquals(7, actual, 0.0);
    }

    @Test
    public void testCalculateAddNegative() {
        double actual = calculator.calculate(-5, "+", -5);
        Assert.assertEquals(-10, actual, 0.0);
    }

    @Test
    public void testCalculateAddPositiveAndNegative() {
        double actual = calculator.calculate(-5, "+", 4);
        Assert.assertEquals(-1, actual, 0.0);
    }

    @Test
    public void testCalculateSub() {
        double actual = calculator.calculate(2,"-",4);
        Assert.assertEquals(-2.0, actual, 0.0);
    }

    @Test
    public void testCalculateSubPositiveAndNegative() {
        double actual = calculator.calculate(-6, "-", 4);
        Assert.assertEquals(-10.0, actual, 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateSubNegative() throws ArithmeticException {
        double actual = calculator.calculate(-2, "-", -4);
        Assert.assertEquals(-1.0, actual, 0.0);
    }

    @Test
    public void testCalculateMul() {
        double actual = calculator.calculate(2, "*", 4);
        Assert.assertEquals(8.0, actual, 0.0);
    }

    @Test
    public void testCalculateDiv() {
        double actual = calculator.calculate(4, "/", 2);
        Assert.assertEquals(2.0, actual, 0.0);

    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDivNull() throws ArithmeticException {
        double actual = calculator.calculate(4, "/", 0);
        Assert.assertEquals(-1.0, actual, 0.0);

    }

    @Test
    public void testCalculateDivNegative() {
        double actual = calculator.calculate(-18, "/", -3);
        Assert.assertEquals(6.0, actual, 0.0);

    }

    @Test
    public void testCalculateDivNegativeAndPositive() {
        double actual = calculator.calculate(-18, "/", 2);
        Assert.assertEquals(-9.0, actual, 0.0);

    }

    @Test
    public void testCalculateDivPositiveAndNegative() {
        double actual = calculator.calculate(7, "/", -2);
        Assert.assertEquals(-3.5, actual, 0.0);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCalculateOperation() throws UnsupportedOperationException {
        double actual = calculator.calculate(7, "%", -2);
        Assert.assertEquals(-3.5, actual, 0.0);

    }

    @Test(expected = CalculatorException.class)
    public void testCalculateValA() throws CalculatorException {
        String actual = calculator.calculateEx("f", "+", "5");
        Assert.assertEquals("2+5", actual);

    }

    @Test(expected = CalculatorException.class)
    public void testCalculateValB() throws CalculatorException {
        String actual = calculator.calculateEx("5", "+", "k");
        Assert.assertEquals("2+5", actual);
    }

    @Test
    public void testCalculateResultString() throws CalculatorException {
        String actual = calculator.calculateEx("2", "+", "5");
        Assert.assertEquals("2+5", actual);
    }
}
