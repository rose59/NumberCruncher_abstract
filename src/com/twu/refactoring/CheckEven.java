package com.twu.refactoring;

/**
 * Created by 欣 on 2014/12/7.
 */
public class CheckEven extends Check {

    public CheckEven(int[] numbers) {
        super(numbers);
    }
    @Override
    boolean check(int number){
            return number % 2 == 0;
    }
}
