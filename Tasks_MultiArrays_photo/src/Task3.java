import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][4];
        matrix1[0][0] = 1;
        matrix1[1][1] = 1;
        int[][] matrix2 = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    matrix2[i][j] = j + 1;
                }
                if (i == 1) {
                    matrix2[i][j] = 1;
                }
                if (i == 3) {
                    matrix2[i][j] = 2 - j;
                }
            }
        }

        int[][] result = new int[3][3];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                int sum = 0;
                for (int k = 0; k < 4; k++) {
                    sum = sum + matrix1[j][k] * matrix2[k][i];

                }
                list.add(sum);
            }
        }
        int q = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[j][i] = list.get(j + q);
            }
            q = q + 3;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

    }
}
