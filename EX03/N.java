package EX03;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número inteiro que tem N como um elo: ");
        int N = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 a " + N + " é: " + soma);

        scanner.close();
    }



}
