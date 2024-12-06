// A estrutura de controle while repete um bloco de código enquanto uma condição for verdadeira.
// Quando usar: quando não sabemos a quantidade de repetições que ocorrerão previamente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criação do objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Inicializando as variáveis
        int i = sc.nextInt(); // Lê o primeiro valor digitado
        int soma = 0; // Inicializa a soma com 0

        // A estrutura while irá rodar enquanto o valor de 'i' for diferente de 0
        while (i != 0) {  // Condição de parada: enquanto 'i' for diferente de 0

            soma += i; // Adiciona o valor de 'i' à variável soma (soma = soma + i)

            // Lê um novo valor para 'i' a cada iteração do loop
            i = sc.nextInt(); // Essa leitura ocorre a cada volta do while
        }

        // Exibe a soma acumulada
        System.out.println(soma); // Imprime a soma dos valores fornecidos pelo usuário

        // Fecha o scanner para liberar recursos
        sc.close();
    }
}
