public class Main {
    public static void main(String[] args) {
        displayPattern(5);
    }

    private static void displayPattern(int n) {
        int anotherTemp = n;

        for (int j = 1; j <= n; j++) {
            int temp = n;

            for (int i = 1; i <= anotherTemp; i++) {
                System.out.print(temp + " ");
                temp -= 1;
            }
            System.out.println();

            anotherTemp--;
        }
    }
}
