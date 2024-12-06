// É uma boa prática inicializar variáveis com um valor inicial, como 0 ou outro valor adequado,
// para evitar erros de compilação em casos onde a variável pode não ser atribuída em determinadas condições.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando um scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Inicializando a variável discount com 0, para garantir que sempre terá um valor atribuído
        double discount = 0;

        // Recebe o preço do produto informado pelo usuário
        double price = sc.nextDouble();

        // Se o preço for maior que 100, aplica-se um desconto de 10%
        if (price > 100.0) {
            discount = price * 0.1; // Desconto de 10% sobre o preço
        }

        // Exibe o valor do desconto (0 caso o preço não seja maior que 100)
        System.out.println(discount);

        // Fecha o scanner após o uso para liberar recursos
        sc.close();
    }
}
