//estrutura if else + operadores e tipos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        // o java não aceita que façamos if else else else como em outras linguagens, deve ser usar if else if else.
        // quando temos so uma linha de código dentro do if ou else, podemos omitir as chaves.

        if (number > 0) {
            System.out.println("O número é positivo.");
        } else   if (number < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        sc.close();
    }
}
