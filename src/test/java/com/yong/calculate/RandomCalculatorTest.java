package com.yong.calculate;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RandomCalculatorTest {
    @Test
    public void plus(){
        // given
        RandomCalculator randomCalculator = new RandomCalculator(new Random(){
            @Override
            public int nextInt(){
                return 3;
            }
        }, new Calculator());

        // when
        int result = randomCalculator.plus(2, 5);

        // then
        assertThat(result, is(10));
    }

    @Test
    public void plus_mockito(){
        // given
        Random random = mock(Random.class);
        when(random.nextInt()).
                thenReturn(3);
        RandomCalculator randomCalculator = new RandomCalculator(random, new Calculator());

        // when
        int result = randomCalculator.plus(2, 5);

        // then
        assertThat(result, is(10));
    }
}
