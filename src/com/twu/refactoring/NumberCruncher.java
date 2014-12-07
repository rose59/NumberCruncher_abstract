package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        CheckEven checkEven = new CheckEven();
        return checkEven.check(numbers);
    }


    public int countOdd() {
        CheckOdd checkOdd = new CheckOdd();
        return checkOdd.check(numbers);
    }

    public int countPositive() {
        CheckPositive checkPositive = new CheckPositive();
        return checkPositive.check(numbers);
    }

    public int countNegative() {
        CheckNegative checkNegative = new CheckNegative();
        return checkNegative.check(numbers);
    }
}
