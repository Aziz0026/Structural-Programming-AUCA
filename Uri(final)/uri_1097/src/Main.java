public class Main {

    public static void main(String[] args) {
        for (int i = 1, j = 7; i <= 9; i += 2, j += 2) {
            for (int k = j; k >= (j - 2); k--) {
                System.out.print("I=" + i + " J=" + k + "\n");
            }
        }
    }
}
