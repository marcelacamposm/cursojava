
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char r;

        do{
            System.out.println ("Digite a temperatura em Celsius (digite usando vírgula):");

            double c = sc.nextDouble();

            double f = (9.0 *c / 5.0 ) + 32.0;

            System.out.printf ("Equivalente em Fahrenheit: %.2f%n", f);

            System.out.println ("Deseja repetir?");
            r = sc.next().charAt(0);


        } while (r == 's');


        sc.close();
    }
}