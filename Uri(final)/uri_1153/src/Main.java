import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                n,
                a,
                m = 1;

        n = sc.nextInt();

        for (a = n; a >= 1; a--) {
            m *= a;
        }

        System.out.printf("%d\n", m);
    }
}
