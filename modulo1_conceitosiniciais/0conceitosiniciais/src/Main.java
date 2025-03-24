import java.util.Locale; // Importando a classe Locale para configurar o formato regional (ex.: separador decimal).

// Em Java, tudo deve estar dentro de uma classe porque é uma linguagem orientada a objetos.
public class Main { // Define uma classe chamada "Main".
    public static void main(String[] args) { // Ponto de entrada do programa, onde a execução começa.

        // Declaração de variáveis:
        // Sintaxe: <tipo> <nome> = <valor inicial>; (o valor inicial é opcional)
        // Tipos principais: int = inteiro, double = número decimal, String = texto, char = caractere único.
        String nome = "Maria"; // Cadeia de caracteres.
        int idade = 31; // Número inteiro.
        double renda = 4000.0; // Número decimal.

        // Configuração de formato regional:
        Locale.setDefault(Locale.US); // Define o formato regional para EUA, alterando o separador decimal para o ponto (.).

        // Mais variáveis de exemplo:
        int y = 5; // Número inteiro.
        double x = 10.85471; // Número decimal com precisão maior.

        // Impressão no console:
        // System.out.print() = imprime sem quebra de linha.
        // System.out.println() = imprime com quebra de linha.
        // System.out.printf() = imprime formatado (ex.: %.2f para 2 casas decimais).

        System.out.println("Olá Mundo! "); // Imprime "Olá Mundo!" com quebra de linha.
        System.out.print("Olá Mundo! "); // Imprime "Olá Mundo!" sem quebra de linha.
        System.out.println(y); // Imprime o valor da variável "y" com quebra de linha.
        System.out.println(x); // Imprime o valor de "x" com quebra de linha.
        System.out.printf("%.2f%n", x); // Imprime "x" formatado com 2 casas decimais e quebra de linha.
        System.out.println("RESULTADO = " + x + " METROS"); // Concatena texto com variáveis e imprime.
        System.out.printf("RESULTADO = %.2f METROS%n", x); // Imprime "x" formatado com 2 casas decimais.
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // Exemplo com múltiplas variáveis formatadas.

        // Expressões aritméticas:
        // + = adição, - = subtração, * = multiplicação, / = divisão, % = resto da divisão.
        // Exemplo:
        // 14 / 3 = 4 (divisão inteira)
        // 14 % 3 = 2 (resto da divisão)
    }
}

// Tipos de Dados em Java:
// int = números inteiros, ex.: -10, 0, 42 (ex.: int idade = 25;).
// double = números decimais, ex.: 3.14, 2500.75 (maior precisão que float).
// String = texto ou cadeia de caracteres, ex.: "Maria" (ex.: String nome = "Maria";).
// char = um único caractere, ex.: 'M' (ex.: char inicial = 'M';).

// Especificadores de Formato no printf:
// %f = ponto flutuante (número decimal), ex.: %.2f (2 casas decimais).
// %d = inteiro (números inteiros), ex.: printf("%d", 42);.
// %s = texto (Strings), ex.: printf("%s", "Java");.
// %n = quebra de linha, equivalente a \n (ex.: printf("Olá%nMundo!");).






