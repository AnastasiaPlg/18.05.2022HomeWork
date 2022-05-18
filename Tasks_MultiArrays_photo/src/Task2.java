import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1) ) {
                    chessBoard[i][j] = "W";
                } else chessBoard[i][j] = "B";
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(chessBoard[i]));

        }
    }
}
