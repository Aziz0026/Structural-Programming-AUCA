import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password = 2002;

        while ((sc.nextInt()) != password) {
            System.out.print("Senha Invalida\n");
        }
        System.out.print("Acesso Permitido\n");
    }
}
