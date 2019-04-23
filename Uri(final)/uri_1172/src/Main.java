import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++){
            int x = sc.nextInt();

            if(x <= 0 ) {
                numbers[i] = 1;
            }else{
                numbers[i] = x;
            }

            System.out.println("X[" + i + "]" + " " + "=" + " " + numbers[i]);
        }
    }
}
