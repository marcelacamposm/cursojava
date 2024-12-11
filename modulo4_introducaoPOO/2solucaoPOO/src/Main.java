import java.util.Locale; // Importa o pacote para configuração de localidade.
import java.util.Scanner; // Importa o pacote para entrada de dados.

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o formato de números como o dos Estados Unidos (ex.: ponto decimal em vez de vírgula).
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para leitura de dados do usuário.

        Product product = new Product(); // Cria um objeto da classe Product.

        // Entrada de dados do produto.
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine(); // Lê o nome do produto.

        System.out.print("Price: ");
        product.price = sc.nextDouble(); // Lê o preço do produto.

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt(); // Lê a quantidade inicial em estoque.

        System.out.println(); // Linha em branco para organização.
        System.out.println("Product data: " + product); // Imprime os dados do produto usando o método toString().

        System.out.println(); // Linha em branco para organização.
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt(); // Lê a quantidade de produtos a serem adicionados ao estoque.
        product.addProducts(quantity); // Adiciona os produtos ao estoque chamando o método addProducts().

        System.out.println(); // Linha em branco para organização.
        System.out.println("Updated data: " + product); // Imprime os dados atualizados do produto.

        System.out.println(); // Linha em branco para organização.
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt(); // Lê a quantidade de produtos a serem removidos do estoque.
        product.removeProducts(quantity); // Remove os produtos do estoque chamando o método removeProducts().

        System.out.println(); // Linha em branco para organização.
        System.out.println("Updated data: " + product); // Imprime os dados atualizados do produto.

        sc.close(); // Fecha o objeto Scanner para liberar recursos.
    }
}
