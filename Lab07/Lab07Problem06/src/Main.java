import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bestScore = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[] scores = new int[number];

        System.out.print("Enter " + number + " score: ");

        for (int i = 0; i < number; i++) {
            int next = sc.nextInt();

            if (next > bestScore) {
                bestScore = next;
            }

            scores[i] = next;
        }

        for (int i = 0; i < number; i++) {
            String grade = "";

            if (scores[i] >= bestScore - 10) {
                grade = "A";
            } else if (scores[i] >= bestScore - 20) {
                grade = "B";
            } else if (scores[i] >= bestScore - 30) {
                grade = "C";
            } else if (scores[i] >= bestScore - 40) {
                grade = "D";
            }

            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

    }
}
