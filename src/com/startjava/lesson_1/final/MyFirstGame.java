package com.startjava.lesson_1.finaltask;

public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNum = 37;
        int playerNum = 0;
        int rand = 0;

        while (playerNum != hiddenNum) {
            rand++;
            playerNum = playerNum + (rand % 10);
            if (playerNum < 1) {
                playerNum = 1 + (rand % 10);
            } else if (playerNum > 100) {
                playerNum = 0;
            }
            if (playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            } else if (playerNum < hiddenNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            }
        }

        System.out.println("Вы победили! Загаданное число: " + playerNum);
    }
}