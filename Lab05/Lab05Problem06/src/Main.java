import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int giveInteger;
        int sum = 0;

        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");

            giveInteger = sc.nextInt();
            sum += giveInteger;

        } while (giveInteger != 0);

        System.out.println("The sum is " + sum);
    }
}