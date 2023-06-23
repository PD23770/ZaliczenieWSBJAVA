package com.example.test;

import org.junit.Assert;
import org.junit.Test;
import com.example.calculator.Calculator;

public class CalculatorTest {

    @Test
    public void testDodaj() {
        double result = Calculator.dodaj(2.5, 3.5);
        Assert.assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testOdejmij() {
        double result = Calculator.odejmij(5.0, 2.5);
        Assert.assertEquals(2.5, result, 0.001);
    }

    @Test
    public void testPomnoz() {
        double result = Calculator.pomnoz(2.0, 3.0);
        Assert.assertEquals(6.0, result, 0.001);
    }
}
