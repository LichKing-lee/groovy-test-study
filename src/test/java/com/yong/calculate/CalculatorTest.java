package com.yong.calculate;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        this.calculator = new Calculator();
    }

    @Test
    public void plus() throws Exception {
        // when
        int result = calculator.plus(2, 5);

        // then
        assertThat(result, is(7));
    }

    @Test
    public void plus_multiple() throws Exception {
        // when
        int result = calculator.plus(2, 5, 7, 10);

        // then
        assertThat(result, is(24));
    }
}