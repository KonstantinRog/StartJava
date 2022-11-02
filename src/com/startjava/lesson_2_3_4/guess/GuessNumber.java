package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);
    private int attemptNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        hiddenNumber = (int) (Math.random() * 100) + 1;
        attemptNumber = 10;
        player1.clearNumbers();
        player2.clearNumbers();
        System.out.println("У каждого игрока по " + attemptNumber + " попыток");
        while (attemptNumber > 0) {
            if (tryToGuess(player1) || tryToGuess(player2)) {
                break;
            }
            attemptNumber--;
        }
        outputPlayerNumbers(player1);
        outputPlayerNumbers(player2);
    }

    private boolean tryToGuess(Player player) {
        inputNumber(player);
        if (player.getNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с "
                    + player.getAttemptNumber() + " попытки");
            return true;
        }
        if (attemptNumber - 1 == 0) {
            System.out.println("У " + player.getName() + " закончились попытки");
        } else if (player.getNumber() > hiddenNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + " введите число:");
        player.addNumber(scan.nextInt());
    }

    private void outputPlayerNumbers(Player player) {
        System.out.println("\nЧисла игрока " + player.getName() + ":");
        int[] copyNumbers = player.getNumbers();
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.print(i == 5 ? "\n" : "");
            System.out.print(copyNumbers[i] + " ");
        }
        System.out.println();
    }
}