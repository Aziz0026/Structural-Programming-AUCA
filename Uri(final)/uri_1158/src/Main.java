import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                n,
                x,
                y,
                j,
                k;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;

            x = sc.nextInt();
            y = sc.nextInt();

            for (j = x, k = 0; k < y; j++) {
                if (j % 2 != 0) {
                    sum += j;
                    k += 1;
                }
            }

            System.out.println(sum);
        }
    }
}