import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        int positiveQty = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            double number = sc.nextDouble();


            if (isPerfect(number)) {
                positiveQty++;
                total += number;
            }
        }

        System.out.println(positiveQty + " valores positivos");
        System.out.printf("%.1f\n", total / positiveQty);
    }

    private static boolean isPerfect(double n) {
        return n >= 0;
    }
}
