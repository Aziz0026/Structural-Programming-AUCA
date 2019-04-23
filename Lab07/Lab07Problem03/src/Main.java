import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int x = sc.nextInt();

        int[] numbers = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Enter " + i + " element: ");
            int n = sc.nextInt();

            numbers[i] = n;
        }

        System.out.println("\nBefore reversing: ");
        System.out.println(Arrays.toString(numbers));

        reverse(numbers);
        System.out.println("\nAfter reversing: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
