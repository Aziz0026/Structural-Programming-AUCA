public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(456));
        System.out.println(isPolindrome(12325));
    }

    private static boolean isPolindrome(int x) {
        if (x == reverse(x)) {
            return true;
        }
        return false;
    }

    private static int reverse(int x) {
        int result = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            result = (result * 10) + lastDigit;
            x = x / 10;
        }

        return result;
    }
}
