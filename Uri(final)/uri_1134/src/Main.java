import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
                x = 0,
                alcohol = 0,
                gasoline = 0,
                diesel = 0;

        while (x != 4) {
            x = sc.nextInt();

            if (x == 1) {
                alcohol += 1;
            } else if (x == 2) {
                gasoline += 1;
            } else if (x == 3) {
                diesel += 1;
            }
        }

        System.out.print("MUITO OBRIGADO\n");
        System.out.print("Alcool: " + alcohol + "\n");
        System.out.print("Gasolina: " + gasoline + "\n");
        System.out.print("Diesel: " + diesel + "\n");
    }
}

