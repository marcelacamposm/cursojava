import java.util.Locale; //importando a classe local para podermos usar a funcao de mudar o local para US.

//Java é uma linguagem orientada a objetos então tudo que escrevemos deve estar dentro de uma classe

public class Main { //Essa declaração é o que está criando uma classe
    public static void main(String[] args) { // Essa declaração define o ponto de entrada da aplicação, ou onde ele vai começar

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        //Impressão:
        // print é imprimir sem quebra de linha, println com quebra e printf formatado para quando se quer especificar o tamanho.

        Locale.setDefault(Locale.US); // para mudar o local para USA e virar . ao invés de , na separação de decimal.

        int y = 5;
        double x = 10.85471;

        System.out.println ("Olá Mundo! ");
        System.out.print ("Olá Mundo! ");
        System.out.println (y);
        System.out.println (x);
        System.out.printf ("%.2f%n" , x); // o f é de formatado e se usa %.2f e %n para a quebra de linha.
        System.out.println ("RESULTADO =" + x + " METROS");
        System.out.printf ("RESULTADO = %.2f METROS%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}

// Expressões Aritméticas:
// + adição  - subtração  * multiplicação  / divisão  % resto
//14/3 é a divisão normal, vai dar 4 mas se fizer 14%3 o resultado que sai é o RESTO que é 2.

// Declaração de variáveis:
// * é comum que em java a primeira letra da variável seja minúscula

// Sintaxe: <tipo> <nome> = <valor inicial> ; (valor inicial é opcional)
// int = num inteiro, double = num com ponto flutuante ou decimal e tem mais precisão que o float, string é cadeia de caracteres e char, apenas um caractere.
// %f = pontoflutuante %d = inteiro %s = texto %n = quebra de linha






