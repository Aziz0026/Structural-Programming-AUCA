import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int a, x;

        x = sc.nextInt();

        for (a = 0; a <= 9; a++) {
            numbers[a] = x;
            System.out.printf("N[%d] = %d\n", a, x);
            x *= 2;
        }
    }
}
