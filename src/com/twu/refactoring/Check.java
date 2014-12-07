package com.twu.refactoring;

/**
 * Created by 欣 on 2014/12/7.
 */
public  abstract class Check {
    private int count;
    public  Check(int []numbers) {
        for (int number : numbers) {
            if (check(number)) this.count++;
        }
    }
    abstract boolean check(int number);

    public int getCount() {
        return count;
    }
}
