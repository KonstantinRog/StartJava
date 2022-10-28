package com.startjava.lesson_2_3_4.guess;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scan.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "";
        do {
            game.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}