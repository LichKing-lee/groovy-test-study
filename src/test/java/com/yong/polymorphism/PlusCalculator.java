package com.yong.polymorphism;

import java.util.Arrays;

public class PlusCalculator implements Calculator {
    @Override
    public int calculate(int... targets) {
        return Arrays.stream(targets)
                .sum();
    }
}
