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
                int p = 10;
                int tempC = 1;

                for (z = 11; z >= 7; z--) {
                    for (c = tempC; c <= p; c--) {
                        average += M[z][c] / 30;
                    }
                    tempC++;
                    p--;
                }


                System.out.printf("%.1f\n", average);
                break;
            case "S":
                int h = 10;
                int tempK = 1;

                for (z = 11; z >= 7; z--) {
                    for (c = tempK; c <= h; c++) {
                        sum += M[z][c];
                    }
                    tempK++;
                    h--;
                }

                System.out.printf("%.1f\n", sum);
                break;
            default:
                System.err.println("Something went wrong!!");
        }
    }
}