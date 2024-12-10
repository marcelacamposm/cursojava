// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 2 valores inteiros:");

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) { //dessa forma pode-se escrever os números em qualquer ordem
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }
    }
}