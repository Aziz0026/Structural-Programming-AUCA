import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 rows and 4 columns");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}
