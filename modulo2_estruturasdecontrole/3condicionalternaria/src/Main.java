// Estrutura condicional ternária: Uma forma compacta de decidir um valor com base em uma condição.(é um if-else reduzido)

public class Main {
    public static void main(String[] args) {

        // Exemplo 1: Usando a estrutura ternária para aplicar um desconto baseado no preço
        double preco = 34.5;

        // Se o preço for menor que 20.0, aplica-se 10% de desconto, senão aplica-se 5%.
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("Preço antes: " + preco); // Exibe o preço original
        System.out.println("Desconto aplicado: " + desconto); // Exibe o valor do desconto aplicado

        // Exemplo 2: Usando o tradicional if-else para realizar a mesma operação
        double preco2 = 10;
        double desconto2;

        // Estrutura if-else tradicional, comparando o preço e aplicando o desconto correspondente
        if (preco2 < 20.0) {
            desconto2 = preco2 * 0.1; // Aplica 10% de desconto se o preço for menor que 20
        } else {
            desconto2 = preco2 * 0.05; // Aplica 5% de desconto caso contrário
        }

        System.out.println("Preço antes: " + preco2); // Exibe o preço original
        System.out.println("Desconto aplicado: " + desconto2); // Exibe o valor do desconto aplicado
    }
}
