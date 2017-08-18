package com.yong.polymorphism;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {
    @Test
    public void plus(){
        // given
        Calculator calculator = new PlusCalculator();

        // when
        int result = calculator.calculate(2, 5, 7);

        // then
        assertThat(result, is(14));
    }
}