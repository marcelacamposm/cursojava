//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int numero = sc.nextInt();

        if (numero % 2 == 0)   {
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");

        }

    }
}