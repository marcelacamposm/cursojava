//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número do funcionário:");

        int numfunc = sc.nextInt();

        System.out.println("Insira o número de horas trabalhadas:");
        double hora = sc.nextDouble();

        System.out.println("Insira o valor que o funcionário recebe por hora:");
        double valorhora = sc.nextDouble();

        double salario = valorhora * hora;

        System.out.printf ("Número do funcionário: " + numfunc + "%nSalário do funcionário: %.2f", salario );
    }
}