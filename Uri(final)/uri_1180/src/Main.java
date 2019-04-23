import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int integerQty = sc.nextInt();

        int[] numbers = new int[integerQty];

        for (int i = 0; i < integerQty; i++) {
            int x = sc.nextInt();

            numbers[i] = x;
        }

        int index = getIndexOfMin(numbers);

        System.out.println("Menor valor: " + numbers[index]);
        System.out.println("Posicao: " + index);
    }

    private static int getIndexOfMin(int[] a) {
        int lowestIndex = 0;
        int lowestNumber = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] < lowestNumber) {
                lowestNumber = a[j];
                lowestIndex = j;
            }
        }

        return lowestIndex;
    }
}
