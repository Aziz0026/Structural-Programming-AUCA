import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int
                correct = 0,
                incorrect = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of tests? ");

        int numberOfTests = sc.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int x = (int) (Math.random() * 50 + 1);
            int y = (int) (Math.random() * 50 + 1);

            System.out.print(x + " + "  + y + " = ");
            int answer = sc.nextInt();

            if(answer != x + y){
                incorrect++;
            }else{
                correct++;
            }
        }

        System.out.println("Number of correct answers: " + correct);
        System.out.println("Number of incorrect answers: " + incorrect);
    }
}
