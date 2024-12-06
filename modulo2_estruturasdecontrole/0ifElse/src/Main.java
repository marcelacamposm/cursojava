// Estrutura if-else + Operadores e Tipos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário para digitar um número
        System.out.print("Digite um número: ");
        int number = sc.nextInt(); // Lê o número inteiro digitado pelo usuário

        // A estrutura if-else verifica se o número é positivo, negativo ou zero
        // O Java não aceita múltiplos "else" encadeados sem "if" intermediário, então devemos usar "else if".
        // Se houver apenas uma linha de código dentro de um bloco if ou else, podemos omitir as chaves.

        if (number > 0) { // Se o número for maior que zero
            System.out.println("O número é positivo.");
        } else if (number < 0) { // Se o número for menor que zero
            System.out.println("O número é negativo.");
        } else { // Caso o número seja zero
            System.out.println("O número é zero.");
        }

        sc.close(); // Fecha o scanner após o uso
    }
}
