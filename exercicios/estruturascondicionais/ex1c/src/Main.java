//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }
    }
}