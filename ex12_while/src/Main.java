//É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
//Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.
//fazer os testes de mesa do while

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int i = sc.nextInt(); // essa parte é lida so a 1 vez que executa o programa.
        int soma = 0;

        while (i!=0){

            soma += i;// aqui indicamos o programa a acrescentar i a soma total toda vez que a variavel passar pelo while.
            // é o mesmo que soma = soma + i.
            i = sc.nextInt(); //toda vez que o numero digitado for diferente de 0, vai bater no comando e voltar para o inicio do while.


        }

        System.out.println (soma);

        sc.close();
    }
}