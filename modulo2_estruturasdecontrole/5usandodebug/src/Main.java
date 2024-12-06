// Importando as classes necessárias
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Configura a localidade para usar o padrão de ponto como separador decimal (para valores em reais, por exemplo)
        Locale.setDefault(Locale.US);

        // Criando um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Lendo os valores de largura, comprimento e preço do metro quadrado
        double largura = sc.nextDouble(); // Lê a largura
        double comprimento = sc.nextDouble(); // Lê o comprimento
        double metroQuadrado = sc.nextDouble(); // Lê o preço do metro quadrado

        // Calculando a área (largura * comprimento)
        double area = largura * comprimento;

        // Calculando o preço total (área * preço por metro quadrado)
        double preco = area * metroQuadrado;

        // Imprimindo a área formatada para duas casas decimais
        System.out.printf("AREA = %.2f%n", area);

        // Imprimindo o preço formatado para duas casas decimais
        System.out.printf("PRECO = %.2f%n", preco);

        // Fechando o scanner para evitar vazamento de recursos
        sc.close();
    }
}
