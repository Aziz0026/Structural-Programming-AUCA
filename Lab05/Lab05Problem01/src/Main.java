import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, qty = 0;
        double totalSum = 0;

        while ((x = sc.nextInt()) != 0) {
            totalSum += x;
            qty++;
        }

        if (totalSum != 0) {
            System.out.printf("The arithmetic mean is %.1f\n", totalSum / qty);
        }else{
            System.out.println("Nothing to calculate");
        }
    }
}
