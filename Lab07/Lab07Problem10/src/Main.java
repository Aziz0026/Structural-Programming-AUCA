import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            list[i] = sc.nextInt();
        }

        list = removeDuplicates(list);

        // Print updated array
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }

    private static int[] removeDuplicates(int[] A) {
        if (A.length < 2)
            return A;

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }

        int[] B = Arrays.copyOf(A, j + 1);

        return B;
    }
}
