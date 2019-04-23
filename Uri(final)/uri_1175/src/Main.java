import java.util.Scanner;

public class Main {
    private static int[] number = new int[20];

    public static void main(String[] args) {
        reverse(number);

        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, number[i]);
        }
    }

    private static void reverse(int[] array) {
        Scanner sc = new Scanner(System.in);

        for (int i = 19; i >= 0; i--) {
            array[i] = sc.nextInt();
        }
    }
}
