package EX02;
import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número PAR (romântico).");
        } else {
            System.out.println(numero + " é um número ÍMPAR(cial).");
        }

        scanner.close();
    }
        
    }
    

