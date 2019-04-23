import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            System.out.println(sumOfNumbers(y, x));
        } else {
            System.out.println(sumOfNumbers(x, y));
        }
    }

    private static int sumOfNumbers(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}
