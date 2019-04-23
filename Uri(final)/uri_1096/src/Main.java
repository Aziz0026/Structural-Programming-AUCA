public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            for (int j = i, k = 7; k >= 5; k -= 1) {
                System.out.printf("I=%d J=%d\n", j, k);
            }
        }
    }
}
