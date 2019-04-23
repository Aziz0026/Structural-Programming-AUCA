public class Main {
    public static void main(String[] args) {
        System.out.println("\ni           m(i)     ");
        System.out.println("---------------------");

        for (double i = 1; i <= 20; i++) {
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", m(i));
        }
    }

    private static double m(double x) {
        double sum = 0;

        for (double i = 1; i <= x; i++) {
            sum += x / (x + 1);
        }

        return sum;
    }
}
