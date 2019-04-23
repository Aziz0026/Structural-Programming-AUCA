import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int coordinate = sc.nextInt();

        System.out.print("Coordinate of 1st point: ");
        int first = sc.nextInt();

        System.out.print("Coordinate of 2nd point: ");
        int second = sc.nextInt();

        first = Math.abs(first - coordinate);
        second = Math.abs(second - coordinate);

        if (first > second) {
            System.out.println("2nd point is closer. Distance " + second);
        } else {
            System.out.println("1st point is closer. Distance " + first);

        }

    }
}
