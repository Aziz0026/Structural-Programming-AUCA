import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                x,
                counter = 0,
                sum = 0;

        while ((x = sc.nextInt()) > 0) {
            sum += x;
            counter++;
        }

        System.out.printf("%.2f\n", (float) sum / counter);
    }
}
