import java.util.Locale; // Importando a classe Locale para configurar o formato regional (ex.: separador decimal).

public class Main {
    public static void main(String[] args) { // Ponto de entrada do programa, onde a execução começa.

        // Declaração de variáveis:
        String product1 = "Computer"; // Nome do primeiro produto.
        String product2 = "Office desk"; // Nome do segundo produto.

        int age = 30; // Idade da pessoa.
        int code = 5290; // Código de identificação do produto.
        char gender = 'F'; // Gênero da pessoa ('F' para feminino, por exemplo).

        double price1 = 2100.0; // Preço do primeiro produto.
        double price2 = 650.50; // Preço do segundo produto.
        double measure = 53.234567; // Medida com várias casas decimais.

        // Impressão de informações sobre os produtos:
        System.out.println("Products:"); // Imprime "Products:".
        // Imprime informações do primeiro produto, com o preço formatado para 2 casas decimais.
        System.out.printf("%s, which price is S %.2f%n", product1, price1);
        // Imprime informações do segundo produto, com o preço formatado para 2 casas decimais.
        System.out.printf("%s, which price is S %.2f%n%n", product2, price2);

        // Imprime informações sobre a pessoa (idade, código e gênero).
        System.out.printf("Record: %d years old, code %d, gender %c%n%n", age, code, gender);

        // Imprime a medida com 6 casas decimais (padrão do printf para números float/double).
        System.out.printf("Measure with eight decimal places: %f%n", measure);
        // Imprime a medida com 3 casas decimais.
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        // Muda o formato para usar o ponto como separador decimal (para a região dos EUA).
        Locale.setDefault(Locale.US);
        // Imprime a medida com 3 casas decimais no formato de ponto decimal (padrão dos EUA).
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
