import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;

        while (((x = input.nextInt()) > 0) && ((y = input.nextInt()) > 0)) {

            int sum = 0;

            if (x > y) {
                for (int i = y; i <= x; i++) {
                    sum += i;
                    System.out.print(i + " ");
                }
                System.out.print("Sum=" + sum + "\n");
            } else {

                for (int i = x; i <= y; i++) {
                    sum += i;
                    System.out.print(i + " ");
                }
                System.out.print("Sum=" + sum + "\n");
            }
        }
    }
}
