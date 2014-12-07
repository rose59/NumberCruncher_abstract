package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        CheckEven checkEven = new CheckEven(numbers);
        return checkEven.getCount();
    }


    public int countOdd() {
        CheckOdd checkOdd = new CheckOdd(numbers);
        return checkOdd.getCount();
    }

    public int countPositive() {
        CheckPositive checkPositive = new CheckPositive(numbers);
        return checkPositive.getCount();
    }

    public int countNegative() {
        CheckNegative checkNegative = new CheckNegative(numbers);
        return checkNegative.getCount();
    }
}
