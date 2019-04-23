import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Year: ");
        int year = sc.nextInt();

        System.out.print("Month: ");
        int month = sc.nextInt();

        System.out.println("Number of days: " + getDaysOfMonths(year, month));
    }

    private static int getDaysOfMonths(int year, int month) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
                return 31;
            default:
                return 30;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
