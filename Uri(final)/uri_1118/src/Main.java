import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                counter = 0,
                x = 0;

        float
                score,
                total = 0,
                average;

        while (counter != 2) {

            score = sc.nextFloat();

            if (score >= 0.0 && score <= 10.0) {
                total += score;
                counter += 1;
            } else {
                System.out.print("Nota invalida\n");
            }
        }

        average = total / 2;
        System.out.printf("media = %.2f\n", average);
    }
}

