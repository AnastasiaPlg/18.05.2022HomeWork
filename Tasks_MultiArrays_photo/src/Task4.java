import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)(10 * Math.random());
                sum = sum + array[i][j];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Sum = " + sum);
    }
}
