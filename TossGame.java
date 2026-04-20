package hidharun;
import java.util.Random;

public class TossGame {
    public static void main(String[] args) {
        Random rand = new Random();

        int toss = rand.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.print(currentPlayer + " starts " + " | P1:" + player1Symbol + " P2:" + player2Symbol);
    }
}