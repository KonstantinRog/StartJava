public class GuessNumber {

    private int hiddenNum;
    private int randomNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setHiddenNum(int hiddenNum) {
        this.hiddenNum = hiddenNum;
    }

    public void tryToGuess(int randomNum, Player player) {
        player.setNumber(player.getNumber() + (randomNum % 10));
        if (player.getNumber() < 1) {
            player.setNumber(1 + randomNum % 10);
        } else if (player.getNumber() > 100) {
            player.setNumber(0);
        }
        if (player.getNumber() > hiddenNum) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < hiddenNum) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.name + " победил! Загаданное число: " + hiddenNum);
        }
    }

    public void play() {
        int randomNum = 0;
        player1.setNumber((int) (Math.random() * 100));
        player2.setNumber((int) (Math.random() * 100));

        while ((player1.getNumber() != hiddenNum) && (player2.getNumber() != hiddenNum)) {
            randomNum++;
            tryToGuess(randomNum, player1);
            if (player1.getNumber() != hiddenNum) {
                tryToGuess(randomNum, player2);
            }
        }
    }
}