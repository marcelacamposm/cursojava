import java.util.Scanner; // Importa a classe Scanner da biblioteca java.util, que permite ler entradas do usuário (como teclado ou arquivos).

public class Main { // Declaração da classe Main, onde o código principal será executado.
    public static void main(String[] args) { // Ponto de entrada do programa, o método main.

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner chamado 'sc' para ler entradas do usuário via teclado.

        // O Scanner permite ler diferentes tipos de dados (inteiros, strings, doubles, etc.) usando métodos como nextInt(), nextDouble(), next(), e assim por diante.

        // Lendo a primeira palavra
        System.out.print("Digite a primeira palavra: "); // Solicita ao usuário que digite a primeira palavra.
        String x = sc.next(); // Lê a próxima palavra até o espaço ou quebra de linha, e armazena na variável 'x'.
        System.out.println("Você digitou: " + x); // Exibe a palavra digitada pelo usuário.

        // Lendo um número inteiro
        System.out.print("Digite um número inteiro: "); // Solicita ao usuário que digite um número inteiro.
        int y = sc.nextInt(); // Lê o próximo número inteiro e armazena na variável 'y'.
        System.out.println("Você digitou o número:" + y); // Exibe o número inteiro digitado.

        // Lendo um número decimal (double)
        System.out.print("Digite um número decimal: "); // Solicita ao usuário que digite um número decimal.
        double numeroDecimal = sc.nextDouble(); // Lê o próximo número decimal (double) e armazena na variável 'numeroDecimal'.
        System.out.println("Você digitou o número decimal: " + numeroDecimal); // Exibe o número decimal digitado.

        // Limpando o buffer e lendo uma linha inteira de texto
        sc.nextLine(); // Limpa o buffer do Scanner para evitar problemas ao ler uma linha de texto após ler números.
        System.out.print("Digite uma frase: "); // Solicita ao usuário que digite uma frase.
        String frase = sc.nextLine(); // Lê a linha inteira digitada e armazena na variável 'frase'.
        System.out.println("Você digitou a frase: " + frase); // Exibe a frase digitada.

        sc.close(); // Fecha o objeto Scanner após o uso para liberar os recursos.

        // Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão.
        // Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().

        // Solução:
        // Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.

        // Regras para o uso do Scanner:
        // 1. Sempre se deve importar a classe para poder se usar: import java.util.Scanner;
        // 2. Sempre se deve criar uma instância do Scanner: Scanner sc = new Scanner(System.in);
        // 3. Sempre se deve fechar o Scanner após o uso: sc.close();

        // Os métodos do Scanner são:
        // next(): Lê a próxima palavra até o primeiro espaço ou quebra de linha.
        // nextLine(): Lê a linha inteira.
        // nextInt(): Lê um número inteiro.
        // nextDouble(): Lê um número decimal.
        // next().charAt(0): Lê o primeiro caractere de uma string.
        // nextBoolean(): Lê um valor boolean (true ou false).

        // hasNextInt(): Verifica se o próximo token é um int.
        // exemplo: if (sc.hasNextInt()) {
        //    int numero = sc.nextInt();
        //}

        // useDelimiter(String pattern): Define um delimitador personalizado.
        // exemplo: sc.useDelimiter(","); // Define a vírgula como delimitador.

        // Usando Scanner para ler dados de um arquivo.
        // Criamos um objeto File para representar o arquivo que queremos ler.
        // O Scanner processa o arquivo linha por linha ou token por token, dependendo do método usado.
        // Importante: É necessário tratar a exceção FileNotFoundException caso o arquivo não seja encontrado.
        // Scanner sc = new Scanner(new File("arquivo.txt"));

        //  Scanner para processar dados de uma string.
        // Separados por espaços ou outro delimitador.
        // Útil para processar strings complexas sem precisar de uma entrada de arquivo.
        // Scanner sc = new Scanner("texto a ser lido");

    } // Fim do método main.
} // Fim da classe Main.
