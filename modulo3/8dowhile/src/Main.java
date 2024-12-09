import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cria o objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Declara uma variável char para armazenar a resposta do usuário
        char r;

        // A estrutura "do-while" executa pelo menos uma vez e depois repete enquanto a condição for verdadeira
        do {
            // Solicita ao usuário para digitar a temperatura em Celsius (usando vírgula como separador decimal)
            System.out.println("Digite a temperatura em Celsius (digite usando vírgula):");

            // Lê o valor de temperatura em Celsius digitado pelo usuário
            double c = sc.nextDouble();

            // Converte a temperatura de Celsius para Fahrenheit usando a fórmula
            // Fahrenheit = (Celsius * 9/5) + 32
            double f = (9.0 * c / 5.0) + 32.0;

            // Exibe o resultado da conversão, formatando para 2 casas decimais
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);

            // Pergunta ao usuário se deseja repetir a conversão
            System.out.println("Deseja repetir?");

            // Lê a resposta do usuário (um único caractere) e armazena na variável 'r'
            r = sc.next().charAt(0);

            // O loop repete enquanto a resposta for 's' (sim)
        } while (r == 's');

        // Fecha o scanner para evitar vazamento de memória
        sc.close();
    }
}
