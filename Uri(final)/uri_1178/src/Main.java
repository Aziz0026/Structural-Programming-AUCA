import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[100];
        double x = sc.nextDouble();

        for (int i = 0; i < 100; i++) {
            System.out.printf("N[" + i + "] = %.4f\n", x);
            numbers[i] = x;
            x = x / 2;
        }
    }
}
