import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] array = new int[4][3][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k <array[i][j].length; k++) {
                    array[i][j][k] = (int)(10 * Math.random());
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.print("Enter a number to increase: ");
        int n = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k <array[i][j].length; k++) {
                    array[i][j][k] = array[i][j][k] + n;
                }
            }
        }
        System.out.println("New array: " + Arrays.deepToString(array));
    }
}
