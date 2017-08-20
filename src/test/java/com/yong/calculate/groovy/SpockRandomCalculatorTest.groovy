package com.yong.calculate.groovy

import com.yong.calculate.Calculator
import com.yong.calculate.RandomCalculator
import spock.lang.Specification

class SpockRandomCalculatorTest extends Specification {
    def "더하기 테스트"() {
        given:
        def randomCalculator = new RandomCalculator([nextInt: { -> 3}] as Random, new Calculator())

        when:
        def result = randomCalculator.plus(2, 5)

        then:
        result == 10
    }
}
