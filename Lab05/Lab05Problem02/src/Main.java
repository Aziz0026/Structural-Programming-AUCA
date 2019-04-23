import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int
                x,
                sum = 0;

        System.out.print("Integer? ");

        x = sc.nextInt();

        while (x > 0) {
            int n = x % 10;
            sum = sum + n;
            x = x / 10;
        }

        System.out.println("The sum of all digits is " + sum);
    }
}
