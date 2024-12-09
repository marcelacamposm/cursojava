//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2;

        System.out.println ("Digite os dois números a serem somados:");
        Scanner sc = new Scanner (System.in);
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        double soma = num1 + num2;

        System.out.printf ("A soma dos números digitados é %.2f", soma);
    }
}