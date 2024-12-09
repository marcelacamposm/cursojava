import java.util.Scanner; // Importando a classe Scanner da biblioteca Java para capturar entradas do usuário.

public class Main { // Definição da classe principal chamada "Main".
    public static void main(String[] args) { // Método principal que é o ponto de entrada do programa.
        // public: acessível a todos, static: chamado sem criar objeto, void: sem retorno, main: início do programa,
        // String[] args: argumentos da linha de comando.

        Scanner sc = new Scanner(System.in); // Criando um objeto da classe Scanner para ler entradas do teclado.
        double x, y, media; // Declarando três variáveis do tipo double: x, y e media.

        System.out.print("Digite o primeiro numero: "); // Exibindo uma mensagem pedindo ao usuário para digitar o primeiro número.
        x = sc.nextDouble(); // Lendo o valor do primeiro número digitado pelo usuário e armazenando em x.
        System.out.print("Digite o segundo numero: "); // Exibindo uma mensagem pedindo ao usuário para digitar o segundo número.
        y = sc.nextDouble(); // Lendo o valor do segundo número digitado pelo usuário e armazenando em y.

        // Calculando a média dos dois números e armazenando o resultado na variável "media".
        media = (x + y) / 2.0;

        // Exibindo o resultado da média com a mensagem "Media = ".
        System.out.print("Media = " + media);

        sc.close(); // Fechando o objeto Scanner para liberar recursos do sistema.
    }
}
