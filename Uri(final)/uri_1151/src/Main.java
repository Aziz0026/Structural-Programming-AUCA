import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                n,
                a = 1,
                b = 1,
                x,
                i;

        n = sc.nextInt();

        if (n == 0) {
            System.out.print("0\n");
        } else {
            System.out.print("0");
        }

        for (i = 1; i < n; i++) {
            System.out.printf(" %d", a);
            x = a;
            a = b;
            b = b + x;
        }

        System.out.println();
    }
}
