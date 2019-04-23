import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int x;

        while ((x = sc.nextInt()) != 0) {
            numbers.add(x);
        }

        for (int i = 0; i <= numbers.size() - 1; i++) {
            for (int j = 1; j <= numbers.get(i); j++) {
                if (numbers.get(i) == j) {
                    System.out.print(j);
                } else {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
