//É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
//Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.

//Sintaxe/Regra:

//início: Executa somente na primeira vez
//condição: V: executa e volta F: pula fora
//incremento: Executa toda vez depois de voltar

//for ( início ; condição ; incremento) {
//comando 1
//comando 2
//        }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int soma = 0;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt ();
         soma += x;
        }

        System.out.println(soma);
    }
}

//IMPORTANTE
//Perceba que a estrutura "para" é ótima para se fazer uma repetição baseada em uma CONTAGEM:

//              for (int i=0; i<5; i++) {
//                  System.out.println("Valor de i: " + i);
//                  }

//CONTAGEM REGRESSIVA:
//              for (int i=4; i>=0; i--) {
//                  System.out.println("Valor de i: " + i);
//                  }
