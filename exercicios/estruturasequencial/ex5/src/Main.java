//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código da peça 1:");
        int peca1 = sc.nextInt();

        System.out.println("Insira o número de peças 1:");
        int num1 = sc.nextInt();

        System.out.println("Insira o valor unitário de cada peça 1:");
        double valor1 = sc.nextDouble();

        System.out.println("Insira o código da peça 2:");
        int peca2 = sc.nextInt();

        System.out.println("Insira o número de peças 2:");
        int num2 = sc.nextInt();


        System.out.println("Insira o valor unitário de cada peça 2:");
        double valor2 = sc.nextDouble();

        double total1 = num1 * valor1;
        double total2 = num2 * valor2;
        double total = total1 + total2;

        System.out.println ("Valor total a ser pago: " + total);
    }
}