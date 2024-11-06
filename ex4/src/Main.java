import java.util.Scanner; // Aqui, você importa a classe Scanner da biblioteca java.util. Essa classe permite que você leia entradas do usuário a partir da entrada padrão (geralmente o teclado), de arquivos e até de strings.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //O Scanner permite ler diferentes tipos de dados (inteiros, strings, doubles, etc.) usando métodos como nextInt(), nextDouble(), next(), e assim por diante.

        // Lendo a primeira palavra
        System.out.print("Digite a primeira palavra: ");
        String x = sc.next(); //next() lê até o próximo espaço ou quebra de linha, então se o usuário digitar várias palavras, next() pega apenas a primeira. Para ler uma linha inteira, você usaria nextLine().
        System.out.println("Você digitou: " + x);

        // Lendo um número inteiro
        System.out.print("Digite um número inteiro: ");
        int y = sc.nextInt();
        System.out.println("Você digitou o número: " + y);

        // Lendo um número decimal (double)
        System.out.print("Digite um número decimal: ");
        double numeroDecimal = sc.nextDouble();
        System.out.println("Você digitou o número decimal: " + numeroDecimal);

        // Limpando o buffer e lendo uma linha inteira de texto
        sc.nextLine(); // limpa o buffer antes de ler a próxima linha
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Você digitou a frase: " + frase);

        sc.close(); // Fechando o scanner após o uso

        //Quando você usa um comando de
        //leitura diferente do nextLine() e
        //dá alguma quebra de linha, essa
        //quebra de linha fica "pendente"
        //na entrada padrão.
        //Se você então fizer um nextLine(),
        //aquela quebra de linha pendente
        //será absorvida pelo nextLine().

        //Solução:
      //  Faça um nextLine() extra antes de
       // fazer o nextLine() de seu
       // interesse.
    }
}
