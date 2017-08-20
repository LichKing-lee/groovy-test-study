package com.yong.calculate.groovy

import com.yong.calculate.Calculator
import com.yong.calculate.RandomCalculator
import groovy.mock.interceptor.MockFor
import org.junit.Test

class RandomCalculatorTest {
    @Test
    void plus(){
        // given
        def randomCalculator = new RandomCalculator([nextInt: { -> 3}] as Random, new Calculator())

        // when
        def result = randomCalculator.plus(2, 5)

        // then
        assert result == 10
    }

    @Test
    void groovy_mocking_test(){
        // given
        def mock = new MockFor(Random)
        mock.demand.nextInt{ 5 }
        mock.use {
            // when
            def result = new Random().nextInt()

            // then
            assert result == 5
        }
    }
}