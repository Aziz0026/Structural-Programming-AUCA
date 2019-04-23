import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int givenLine = sc.nextInt();
        char t = sc.next().charAt(0);

        double m[][] = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        switch (t) {

            case 'S':
                double sum = 0;
                for (int i = 0; i < m[0].length; i++) {
                    sum += m[givenLine][i];
                }
                System.out.printf("%.1f", sum);
                break;
            case 'M':
                double average = 0;
                for (int i = 0; i < m[0].length; i++) {
                    average += m[givenLine][i];
                }
                average /= m[0].length;
                System.out.printf("%.1f", average);
                break;
        }
        System.out.println();
    }
}