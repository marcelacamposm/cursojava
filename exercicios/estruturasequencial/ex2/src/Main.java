//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

import java.util.Scanner;

public class Main {

    static double pi = 3.14159; //double quando precisa de mais precisão e float quando precisa de menos.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("Valor da área desse círculo: %.4f", area);
    }
}