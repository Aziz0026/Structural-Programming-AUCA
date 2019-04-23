import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int first = 1, second = 2, third = 3;

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++, first += 4, second += 4, third += 4) {
            System.out.printf("%d %d %d PUM\n", first, second, third);
        }
    }
}
