import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        while ((x = sc.nextInt()) != 0) {
            int sum = 0;
            int temp = x;
            int counter = 0;

            while (counter != 5) {

                if (temp % 2 == 0) {
                    sum += temp;
                    temp += 2;

                    counter++;
                } else {
                    temp += 1;
                }
            }

            System.out.println(sum);
        }
    }
}
