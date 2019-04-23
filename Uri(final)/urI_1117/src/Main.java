import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float
                x,
                media = 0,
                sum = 0,
                counter = 0;

        Scanner input = new Scanner(System.in);

        while (counter != 2) {
            x = input.nextFloat();

            if (x >= 0.0 && x <= 10.0) {
                sum += x;
                counter += 1;
            } else {
                System.out.print("nota invalida\n");
            }
        }

        media = (float) sum / 2;
        System.out.printf("media = %.2f\n", media);
    }
}

