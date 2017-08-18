package com.yong.calculate;

import java.util.Arrays;

public class Calculator {
    public int plus(int... targets){
        return Arrays.stream(targets)
                .sum();
    }
}
