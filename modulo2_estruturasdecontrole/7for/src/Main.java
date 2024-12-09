// A estrutura de controle "for" repete um bloco de código para um intervalo de valores.
// Quando usar: quando se sabe previamente a quantidade de repetições ou o intervalo de valores.

// IMPORTANTE:
// Perceba que a estrutura "para" é ótima para se fazer uma repetição baseada em uma CONTAGEM:

// Exemplo de contagem crescente:
// for (int i = 0; i < 5; i++) {
//     System.out.println("Valor de i: " + i);
// }
// A estrutura "for" começa com o valor de i = 0 e vai até i = 4 (i < 5),
// imprimindo os valores de i de 0 a 4.

// Exemplo de contagem regressiva:
// for (int i = 4; i >= 0; i--) {
//     System.out.println("Valor de i: " + i);
// }
// Neste caso, a estrutura "for" começa com o valor de i = 4 e vai até i = 0 (i >= 0),
// imprimindo os valores de i de 4 a 0.

// Sintaxe/Regra:
// A sintaxe do for é a seguinte:
// for (início; condição; incremento) {
//     comando 1
//     comando 2
// }

// - início: Executado somente na primeira vez, antes da primeira iteração.
// - condição: Verificada antes de cada iteração. Se verdadeira, o bloco de código é executado.
// - incremento: Executado toda vez após uma iteração ser completada.

// Exemplo de uso do for para somar números fornecidos pelo usuário:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criação do objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Inicializa as variáveis
        int n; // número de entradas que o usuário vai fornecer
        int soma = 0; // variável para acumular a soma dos valores

        // Lê o valor de n (quantidade de números a serem somados)
        n = sc.nextInt();

        // Estrutura de repetição for: repete o bloco n vezes
        // A variável i é inicializada em 0, e o loop continua enquanto i for menor que n, com i sendo incrementado a cada iteração
        for (int i = 0; i < n; i++) {
            // Lê o valor de x
            int x = sc.nextInt();

            // Adiciona o valor de x à soma acumulada
            soma += x; // mesma coisa que soma = soma + x
        }

        // Exibe o valor final da soma
        System.out.println(soma); // Imprime a soma de todos os valores fornecidos pelo usuário
    }
}


