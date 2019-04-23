import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, start, end;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int total = 0;

            start = sc.nextInt();
            end = sc.nextInt();

            if (start > end) {
                for (int j = start - 1; j > end; j--) {

                    if (j % 2 != 0) {
                        total += j;
                    }
                }
            } else if (start < end) {
                for (int j = start + 1; j < end; j++) {
                    if (j % 2 != 0) {
                        total += j;
                    }
                }
            }
            System.out.print(total + "\n");
        }
    }
}

