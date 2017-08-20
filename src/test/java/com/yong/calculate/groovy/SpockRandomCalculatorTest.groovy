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

    def "랜덤 Mocking"() {
        given :
        def random = Mock(Random)
        random.nextInt() >> 3
        def randomCalculator = new RandomCalculator(random, new Calculator())

        when:
        def result = randomCalculator.plus(2, 5)

        then:
        result == 10
    }
}
