import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            divisionByFive(y, x);
        } else {
            divisionByFive(x, y);
        }
    }

    private static void divisionByFive(int start, int end) {

        for (int i = start + 1; i < end; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}
