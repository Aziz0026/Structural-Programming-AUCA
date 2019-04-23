import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");

        // Setting up our array
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The smallest number's index is " + indexOfSmallestElement(numbers));
    }

    private static int indexOfSmallestElement(double[] list) {
        int indexOfMin = 0;
        double min = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                min = list[i];
            }

            if (list[i] < min) {
                min = list[i];
                indexOfMin = i;
            }
        }

        return indexOfMin;
    }
}
