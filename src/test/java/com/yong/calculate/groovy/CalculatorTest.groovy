package com.yong.calculate.groovy

import com.yong.calculate.Calculator
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    def calculator

    @Before
    void setUp(){
        calculator = new Calculator()
    }

    @Test
    void plus() throws Exception {
        // when
        def result = calculator.plus(2, 5)

        // then
        assert result == 7
    }
}
