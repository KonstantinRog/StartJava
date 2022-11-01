package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int len = 10;
    private String name;
    private int attemptNum;

    int[] numbersArr = new int[len];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int index, int number) {
        numbersArr[index] = number;
    }

    public int getNumber(int index) {
        return numbersArr[index];
    }

    public void addAttemptNum() {
        attemptNum++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbersArr, attemptNum);
    }

    public void clearNumbers() {
        Arrays.fill(numbersArr, 0, attemptNum, 0);
    }
}