package com.github.stokito.unitTestExample.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        Assert.assertEquals(4, result);
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        int result = calculator.minus(2, 2);
        System.out.println("result: " + result);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }
}
