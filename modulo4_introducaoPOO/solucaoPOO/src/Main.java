
import java.util.Locale; // Importa a classe Locale para configurar a formatação regional
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define o formato regional para o programa (ponto como separador decimal)
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        // Declara dois objetos da classe 'triangle'
        triangle x, y;

        // Instancia os objetos como novos triângulos
        x = new triangle();
        y = new triangle();

        // Solicita ao usuário as medidas dos lados do triângulo X
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); // Lê o valor do lado 'a' do triângulo X
        x.b = sc.nextDouble(); // Lê o valor do lado 'b' do triângulo X
        x.c = sc.nextDouble(); // Lê o valor do lado 'c' do triângulo X

        // Solicita ao usuário as medidas dos lados do triângulo Y
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); // Lê o valor do lado 'a' do triângulo Y
        y.b = sc.nextDouble(); // Lê o valor do lado 'b' do triângulo Y
        y.c = sc.nextDouble(); // Lê o valor do lado 'c' do triângulo Y

        // Calcula as áreas chamando o método 'area' dos objetos
        double areaX = x.area(); // Chama o método 'area' do objeto 'x'
        double areaY = y.area(); // Chama o método 'area' do objeto 'y'

        // Exibe as áreas calculadas
        System.out.printf("Triangle X area: %.4f%n", areaX); // Mostra a área de X
        System.out.printf("Triangle Y area: %.4f%n", areaY); // Mostra a área de Y

        // Compara as áreas e determina o triângulo com maior área
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close(); // Fecha o Scanner para liberar recursos
    }
}
