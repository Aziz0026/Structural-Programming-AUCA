public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(239));
        System.out.println(sumOfDigits(635));
        System.out.println(sumOfDigits(55555555));

    }

    private static int sumOfDigits(int x) {
        int sum = 0;

        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }

        return sum;
    }
}
