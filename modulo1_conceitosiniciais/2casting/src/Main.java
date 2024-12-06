public class Main { // Início da classe Main, onde o código será executado.
    public static void main(String[] args) { // Ponto de entrada do programa, método main.

        double b, B, h, area; // Declaração das variáveis de tipo double (números com casas decimais).

        b = 6.0; // Inicialização da variável 'b' com valor 6.0 (usando ponto para número decimal).
        B = 8.0; // Inicialização da variável 'B' com valor 8.0.
        h = 5.0; // Inicialização da variável 'h' com valor 5.0.

        area = (b + B) / 2.0 * h; // Cálculo da área do trapézio usando a fórmula: ((b + B) / 2) * h.

        System.out.println(area); // Impressão do valor calculado da área na tela.

        int a, e; // Declaração de variáveis inteiras 'a' e 'e'.
        double resultado; // Declaração da variável 'resultado' do tipo double.

        a = 5; // Inicialização da variável 'a' com valor 5.
        e = 2; // Inicialização da variável 'e' com valor 2.

        resultado = (double) a / e; // Casting: conversão explícita de 'a' para double, garantindo resultado correto na divisão.
        System.out.println(resultado); // Impressão do resultado da divisão com o casting aplicado.

    } // Fim do método main.
} // Fim da classe Main.
