
package EX04;



import java.util.Scanner;



public class primo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("digite um número inteiro: ");

        int N = scanner.nextInt();



        System.out.println("primos da maisa de 1 a " + N + ":");



        for (int i = 2; i <= N; i++) {

            String resultado = isPrimo(i);

            if (!resultado.equals("não é um primo da maisa")) {

                System.out.println(i);

            }

        }

        scanner.close();

    }



    public static String isPrimo(int numero) {

        if (numero <= 1) return "não é um primo da maisa";

        for (int i = 2; i * i <= numero; i++) {

            if (numero % i == 0) return "não é um primo da maisa";

        }

        return "oi primo";

    }

}

