public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        while (counter < 50) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                counter++;

                if (counter % 10 == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }

            number++;
        }
    }
}
