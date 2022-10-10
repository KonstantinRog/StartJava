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
        while ((player1.getNumber() != hiddenNum) && (player2.getNumber() != hiddenNum)) {
            tryToGuess(player1);
            if (player1.getNumber() != hiddenNum) {
                tryToGuess(player2);
            }
        }
    }

    private void tryToGuess(Player player) {
        player.setNumber(scan.nextInt());
        if (player.getNumber() > hiddenNum) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < hiddenNum) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " победил! Загаданное число: " + hiddenNum);
        }
    }
}