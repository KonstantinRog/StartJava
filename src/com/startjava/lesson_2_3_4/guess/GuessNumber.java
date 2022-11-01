package com.startjava.lesson_2_3_4.guess;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);
    private int attemptNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        hiddenNumber = (int) (Math.random() * 100);
        attemptNum = 10;
        player1.clearNumbers();
        player2.clearNumbers();
        System.out.println("У каждого игрока по " + attemptNum + " попыток");
        while (attemptNum > 0) {
            if (tryToGuess(player1)) {
                break;
            }
            if (tryToGuess(player2)) {
                break;
            }
            attemptNum--;
        }
        outputPlayerNumbers(player1);
        outputPlayerNumbers(player2);

    }

    private boolean tryToGuess(Player player) {
        inputNumber(player);
        if (player.getNumber(player.len - attemptNum) == hiddenNumber) {
            int tryNumber = 11 - attemptNum;
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с " + tryNumber + " попытки");
            return true;
        } else if (player.getNumber(player.len - attemptNum) != hiddenNumber && attemptNum - 1 == 0) {
            System.out.println("У " + player.getName() + " закончились попытки");
        } else if (player.getNumber(player.len - attemptNum) > hiddenNumber) {
            System.out.println("Число " + player.getNumber(player.len - attemptNum) + " больше того, что загадал компьютер");
        } else if (player.getNumber(player.len - attemptNum) < hiddenNumber) {
            System.out.println("Число " + player.getNumber(player.len - attemptNum) + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + " введите число:");
        player.addAttemptNum();
        player.setNumber(player.len - attemptNum ,scan.nextInt());
    }

    private void outputPlayerNumbers(Player player) {
        System.out.println("\nЧисла игрока " + player.getName() + ":");
        int[] copyNumbers = player.getNumbers();
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.print(i == 5 ? "\n" + copyNumbers[i] + " " : copyNumbers[i] + " ");
        }
        System.out.println();

    }
}