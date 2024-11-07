// as vezes e bom inicializar colocando o valor 0 ou que a variavel vai receber, para evitar erros de compilação.
// ou fora do if else, ou dentro do if else.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double discount = 0;
        double price = sc.nextDouble();

        if (price > 100.0) {
             discount = price * 0.1;
        }
        System.out.println(discount);

        sc.close();
    }
}