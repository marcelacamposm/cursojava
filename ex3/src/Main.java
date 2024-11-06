public class Main {
    public static void main(String[] args) {

        double b, B, h, area;

        b = 6.0; // é uma boa prática sempre indicar qual é o tipo do número, por ex aqui usamos o double então colocamos o .0 no final mesmo sem casas decimais
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);

        int a, e;
        double resultado;
        a = 5;
        e = 2;
        resultado = (double) a / e; //colocar esse double é uma prática chamada casting, É a conversão explícita de um tipo para outro.É necessário quando o compilador não é capaz de “adivinhar” que o resultado de uma expressão deve ser de outro tipo.
        System.out.println(resultado);

    }
}