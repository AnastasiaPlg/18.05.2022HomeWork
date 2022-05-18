import java.util.Arrays;

public class Task6 {
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

        for (int i = 0; i < 5; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
