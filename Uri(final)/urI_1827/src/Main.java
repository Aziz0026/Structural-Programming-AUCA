import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                n,
                a,
                b;

        while (sc.hasNextInt()) {
            n = sc.nextInt();

            a = 0;
            b = (n - 1);

            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (n / 2 == i && n / 2 == j) {
                        matrix[i][j] = 4;
                    } else if (i >= n / 3 && j >= n / 3 && (n - i) > n / 3 && (n - j) > n / 3) {
                        matrix[i][j] = 1;
                    } else if (i == j) {
                        matrix[i][j] = 2;
                    } else if (i == a && j == b) {
                        matrix[i][j] = 3;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
                a++;
                b--;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}