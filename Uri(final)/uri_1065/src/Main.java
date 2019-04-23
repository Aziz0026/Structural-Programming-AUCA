import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenQty = 0;

        for (int i = 0; i < 5; i++) {
            int giveNumber = sc.nextInt();

            if (isPrime(giveNumber)) {
                evenQty++;
            }
        }

        System.out.println(evenQty + " valores pares");
    }

    private static boolean isPrime(int n) {
        return n % 2 == 0;
    }
}
