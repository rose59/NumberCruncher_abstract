package com.twu.refactoring;

/**
 * Created by 欣 on 2014/12/7.
 */
public abstract class Check {
    private int count;

    public int check(int[] numbers) {
        for (int number : numbers) {
            if (checkNumber(number)) this.count++;
        }
        return this.count;
    }

    abstract boolean checkNumber(int number);

//    public int getCount() {
//        return count;
//    }
}
