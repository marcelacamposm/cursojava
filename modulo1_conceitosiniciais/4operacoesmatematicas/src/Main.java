import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário.

public class Main { // Declaração da classe Main.
    public static void main(String[] args) { // Ponto de entrada do programa.

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário via teclado.

        // Potenciação
        double base = 3; // Define a base da potência.
        double exponent = 2; // Define o expoente da potência.
        double resultPow = Math.pow(base, exponent); // Calcula 3 elevado a 2 (potenciação).
        System.out.println("Potenciação: " + resultPow); // Exibe o resultado da potência (9).

        // Raiz quadrada
        double number = 16; // Define o número para calcular a raiz quadrada.
        double resultSqrt = Math.sqrt(number); // Calcula a raiz quadrada de 16.
        System.out.println("Raiz Quadrada: " + resultSqrt); // Exibe o resultado da raiz quadrada (4).

        // Valor absoluto (usado para cálculo de diferença absoluta)
        System.out.print("Digite o primeiro número: "); // Solicita ao usuário que digite o primeiro número.
        double num1 = sc.nextDouble(); // Lê o primeiro número digitado pelo usuário.

        System.out.print("Digite o segundo número: "); // Solicita ao usuário que digite o segundo número.
        double num2 = sc.nextDouble(); // Lê o segundo número digitado pelo usuário.

        double difference = Math.abs(num1 - num2); // Calcula a diferença absoluta entre os dois números.
        System.out.println("Diferença Absoluta: " + difference); // Exibe a diferença absoluta.

        // Arredondamento para o inteiro mais próximo
        double decimal = 5.7; // Define um número decimal para arredondar.
        long resultRound = Math.round(decimal); // Arredonda o número para o inteiro mais próximo (6).
        System.out.println("Arredondamento: " + resultRound); // Exibe o número arredondado.

        // Arredondamento para o menor valor (floor)
        double valueFloor = 7.8; // Define um valor para arredondar para baixo.
        double resultFloor = Math.floor(valueFloor); // Arredonda para o menor valor inteiro (7.0).
        System.out.println("Floor: " + resultFloor); // Exibe o valor arredondado para baixo.

        // Arredondamento para o maior valor (ceil)
        double valueCeil = 3.2; // Define um valor para arredondar para cima.
        double resultCeil = Math.ceil(valueCeil); // Arredonda para o maior valor inteiro (4.0).
        System.out.println("Ceil: " + resultCeil); // Exibe o valor arredondado para cima.

        // Trigonometria - Seno, Cosseno e Tangente
        double angle = Math.toRadians(45); // Converte o ângulo de 45 graus para radianos.
        double resultSin = Math.sin(angle); // Calcula o seno de 45 graus.
        double resultCos = Math.cos(angle); // Calcula o cosseno de 45 graus.
        double resultTan = Math.tan(angle); // Calcula a tangente de 45 graus.
        System.out.println("Seno(45°): " + resultSin); // Exibe o resultado do seno de 45°.
        System.out.println("Cosseno(45°): " + resultCos); // Exibe o resultado do cosseno de 45°.
        System.out.println("Tangente(45°): " + resultTan); // Exibe o resultado da tangente de 45°.

        // Logaritmo Natural
        double valueLog = 10; // Define o número para calcular o logaritmo natural (ln).
        double resultLog = Math.log(valueLog); // Calcula o logaritmo natural de 10.
        System.out.println("Logaritmo Natural: " + resultLog); // Exibe o resultado do logaritmo natural.

        // Exponencial (e^x)
        double exponentValue = 2; // Define o valor para a exponenciação.
        double resultExp = Math.exp(exponentValue); // Calcula e elevado a 2 (e^2).
        System.out.println("Exponencial: " + resultExp); // Exibe o resultado da exponenciação.

        // Máximo e Mínimo entre dois números
        double num3 = 8.5; // Define o primeiro número.
        double num4 = 4.2; // Define o segundo número.
        double resultMax = Math.max(num3, num4); // Calcula o máximo entre 8.5 e 4.2.
        double resultMin = Math.min(num3, num4); // Calcula o mínimo entre 8.5 e 4.2.
        System.out.println("Máximo: " + resultMax); // Exibe o valor máximo.
        System.out.println("Mínimo: " + resultMin); // Exibe o valor mínimo.

        // Gerando número aleatório entre 0 e 1
        double randomValue = Math.random(); // Gera um número aleatório entre 0.0 e 1.0.
        System.out.println("Número Aleatório: " + randomValue); // Exibe o número aleatório gerado.

        sc.close(); // Fecha o scanner após o uso para liberar recursos.
    }
}
