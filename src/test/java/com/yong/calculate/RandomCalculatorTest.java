package com.yong.calculate;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RandomCalculatorTest {
    @Test
    public void plus(){
        // given
        RandomCalculator randomCalculator = new RandomCalculator(new Random(), new Calculator());

        // when
        int result = randomCalculator.plus(2, 5);

        // then
        while(true){
            if(result == 10) {
                break;
            }
        }

        assertThat(result, is(10));
    }
}
