// Operadores de atribuição composta
// a += b; é o mesmo que a = a + b;
// a -= b; é o mesmo que a = a - b;
// a *= b; é o mesmo que a = a * b;
// a /= b; é o mesmo que a = a / b;
// a %= b; é o mesmo que a = a % b;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Configura a localidade para usar ponto como separador decimal

        Scanner sc = new Scanner(System.in);

        // Lê o número de minutos
        int minutos = sc.nextInt();

        // Inicializa o valor da conta com 50.0
        double conta = 50.0;

        // Se o número de minutos for maior que 100, adiciona um valor extra à conta
        if (minutos > 100) {
            // Operação de atribuição composta
            // A linha abaixo é equivalente a: conta = conta + (minutos - 100) * 2.0;
            conta += (minutos - 100) * 2.0; // Se minutos > 100, o valor extra será calculado e somado à conta
        }

        // Exibe o valor final da conta com 2 casas decimais
        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close(); // Fecha o scanner após o uso
    }
}
