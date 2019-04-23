import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isPalindrome = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String givenString = sc.nextLine();

        int low = 0;
        int high = givenString.length() - 1;

        while (low < high) {
            if (givenString.charAt(low) != givenString.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println(givenString + " is a palindrome");
        } else {
            System.out.println(givenString + " is not a palindrome");
        }
    }
}
