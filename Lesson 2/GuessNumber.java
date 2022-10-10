import java.util.Scanner;

public class GuessNumber {

    private int hiddenNum;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        hiddenNum = (int) (Math.random() * 100);
        while (true) {
            if (tryToGuess(player1)) {
                break;
            }
            if (tryToGuess(player2)) {
                break;
            }
        }
    }

    private boolean tryToGuess(Player player) {
        setPlayerNumber(player);
        if (player.getNumber() > hiddenNum) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
            return false;
        } else if (player.getNumber() < hiddenNum) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Игрок " + player.getName() + " победил! Загаданное число: " + hiddenNum);
            return true;
        }
    }

    private void setPlayerNumber(Player player) {
        System.out.println("Игрок " + player.getName() + " введите число:");
        player.setNumber(scan.nextInt());
    }
}