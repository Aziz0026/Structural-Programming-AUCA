import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNumber;
        int numbers[] = new int[1000];

        maxNumber = sc.nextInt();

        for (int i = 0, j = 0; i < 1000; j++, i++) {
            numbers[j] = j;

            if ((numbers[j]) == maxNumber) {
                j = 0;
            }

            System.out.print("N[" + i + "] = " + numbers[j] + "\n");
        }
    }
}
