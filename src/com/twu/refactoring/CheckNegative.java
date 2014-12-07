package com.twu.refactoring;

/**
 * Created by 欣 on 2014/12/7.
 */
public class CheckNegative extends Check {
//    public CheckNegative(int[] numbers) {
//        super(numbers);
//    }

    @Override
    boolean checkNumber(int number) {
        return number < 0;
    }
}
