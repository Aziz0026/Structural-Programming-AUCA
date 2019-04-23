import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                a,
                b,
                c = 0,
                x, z;

        x = sc.nextInt();

        do {
            z = sc.nextInt();
        } while (x >= z);

        for (a = x, b = 0; b < z; a++) {
            b += a;
            c++;
        }

        System.out.printf("%d\n", c);
    }
}
