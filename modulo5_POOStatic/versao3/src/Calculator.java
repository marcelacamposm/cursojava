public class Calculator {
    // Constante que representa o valor de PI.
    public static final double PI = 3.14159;

    // Método estático para calcular a circunferência de um círculo dado o raio.
    // Utiliza a fórmula: Circunferência = 2 * PI * raio
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    // Método estático para calcular o volume de uma esfera dada o raio.
    // Utiliza a fórmula: Volume = 4/3 * PI * raio^3
    public static double volume(double radius) {
        return 4.0 / 3.0 * PI * Math.pow(radius, 3);
    }
}

//Resumo sobre o uso de métodos e variáveis estáticos em Java:


//Métodos e variáveis static:

//São usados quando você não precisa acessar dados específicos da instância de uma classe.
//Podem ser chamados diretamente pela classe sem a necessidade de criar uma instância da classe.
//        Exemplo: Calculator.circumference(radius) e Calculator.volume(radius).


//Métodos e variáveis não static:

//Normalmente são utilizados quando você precisa acessar ou modificar os dados específicos da instância de uma classe.
//São utilizados dentro da própria instância da classe, ou seja, você precisa criar uma instância da classe para acessar esses membros.
        //Exemplo: student.name, student.grade1, student.totalValueInStock().


//Na main:

//Métodos static podem ser chamados diretamente pelo nome da classe.
//Para acessar membros não estáticos (como atributos e métodos), é necessário criar uma instância da classe primeiro.