import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par[] = new int[5];
        int impar[] = new int[5];

        for (int i = 0, j = 0, k = 0; i < 15; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0) {
                par[k] = x;

                if (k == 4) {
                    k = 0;

                    for (int l = 0; l < 5; l++) {
                        System.out.print("par[" + l + "] = " + par[l] + "\n");
                    }

                    par = new int[5];
                } else {
                    k++;
                }

            } else {
                impar[j] = x;

                if (j == 4) {
                    j = 0;

                    for (int l = 0; l < 5; l++) {
                        System.out.print("impar[" + l + "] = " + impar[l] + "\n");
                    }

                    impar = new int[5];
                } else {
                    j++;
                }
            }
        }

        for (int i = 0; i <  2; i++){
            System.out.println("impar[" + i + "] = " + impar[i]);
        }

        for (int i = 0; i <  3; i++){
            System.out.println("par[" + i + "] = " + par[i]);
        }
    }
}
