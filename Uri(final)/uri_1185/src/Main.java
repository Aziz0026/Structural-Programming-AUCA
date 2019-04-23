import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        double average = 0.0;

        double[][] M = new double[12][12];

        String option;

        int
                c,
                x,
                y,
                z;

        option = sc.nextLine();

        for (x = 0; x <= 11; x++) {
            for (y = 0; y <= 11; y++) {
                M[x][y] = sc.nextDouble();
            }
        }

        switch (option) {
            case "M":
                int p = 11;

                for (z = 0; z <= 11; z++) {
                    for (c = 0; c < p; c++) {
                        average += M[z][c] / 66;
                    }
                    p--;
                }

                System.out.printf("%.1f\n", average);
                break;
            case "S":
                int h = 11;

                for (z = 0; z <= 11; z++) {
                    for (c = 0; c < h; c++) {
                        sum += M[z][c];
                    }
                    h--;
                }

                System.out.printf("%.1f\n", sum);
                break;
            default:
                System.err.println("Something went wrong!!");
        }
    }
}