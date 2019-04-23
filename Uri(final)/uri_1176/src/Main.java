import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                givenNumber,
                first = 0,
                second = 1,
                next = 0,
                c;
        int
                times;

        times = sc.nextInt();

        for (int i = 1; i <= times; i++, first = 0, second = 1) {
            givenNumber = sc.nextInt();
            givenNumber = givenNumber + 1;

            for (c = 0; c < givenNumber; c++) {
                if (c <= 1) next = c;

                else {
                    next = first + second;
                    first = second;
                    second = next;
                }
            }

            System.out.printf("Fib(%d) = %d\n", givenNumber - 1, next);
        }
    }
}
