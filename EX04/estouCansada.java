package EX04;

import java.util.Scanner;

public class estouCansada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número inteiro : ");
        int N = scanner.nextInt();

        System.out.println("primos da maisa de 1 a " + N + ":");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= N) {
            if (isPrimo(numero)) {
                System.out.println(numero + " oi primo.");
            } else {
                System.out.println(numero + " não é um primo da maisa.");
            }
        } else {
            System.out.println("não é um primo de 1 a " + N + ".");
        }

        scanner.close();
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
