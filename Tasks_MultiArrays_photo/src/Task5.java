import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)(10 * Math.random());
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int[] diagonal1 = new int[5];
        int[] diagonal2 = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              if (i == j) {
                  diagonal1[i] = array[i][j];
              }
              if (i == 4 - j) {
                  diagonal2[i] = array[i][j];
              }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(diagonal1));
        System.out.println(Arrays.toString(diagonal2));
    }
}
