package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int ATTEMPTS_LIMIT = 10;
    private String name;
    private int attemptNumber;

    private int[] numbers = new int[ATTEMPTS_LIMIT];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        numbers[attemptNumber] = number;
        attemptNumber++;
    }

    public int getNumber() {
        return numbers[attemptNumber - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptNumber);
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, attemptNumber, 0);
        attemptNumber = 0;
    }
}