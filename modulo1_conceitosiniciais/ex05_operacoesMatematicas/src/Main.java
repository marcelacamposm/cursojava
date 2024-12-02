//operações matemáticas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Potenciação
        double base = 3;
        double exponent = 2;
        double resultPow = Math.pow(base, exponent); // 3^2 = 9
        System.out.println("Potenciação: " + resultPow);

        // Raiz quadrada
        double number = 16;
        double resultSqrt = Math.sqrt(number); // √16 = 4
        System.out.println("Raiz Quadrada: " + resultSqrt);

        // Valor absoluto (usado para cálculo de diferença absoluta)
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double difference = Math.abs(num1 - num2); // Calcula a diferença absoluta
        System.out.println("Diferença Absoluta: " + difference);

        // Arredondamento para o inteiro mais próximo
        double decimal = 5.7;
        long resultRound = Math.round(decimal); // 5.7 → 6 usando o long pq está arredondando
        System.out.println("Arredondamento: " + resultRound);

        // Arredondamento para o menor valor (floor)
        double valueFloor = 7.8;
        double resultFloor = Math.floor(valueFloor); // 7.8 → 7.0
        System.out.println("Floor: " + resultFloor);

        // Arredondamento para o maior valor (ceil)
        double valueCeil = 3.2;
        double resultCeil = Math.ceil(valueCeil); // 3.2 → 4.0
        System.out.println("Ceil: " + resultCeil);

        // Trigonometria - Seno, Cosseno e Tangente
        double angle = Math.toRadians(45); // Convertendo 45 graus para radianos
        double resultSin = Math.sin(angle); // Seno de 45°
        double resultCos = Math.cos(angle); // Cosseno de 45°
        double resultTan = Math.tan(angle); // Tangente de 45°
        System.out.println("Seno(45°): " + resultSin);
        System.out.println("Cosseno(45°): " + resultCos);
        System.out.println("Tangente(45°): " + resultTan);

        // Logaritmo Natural
        double valueLog = 10;
        double resultLog = Math.log(valueLog); // ln(10)
        System.out.println("Logaritmo Natural: " + resultLog);

        // Exponencial (e^x)
        double exponentValue = 2;
        double resultExp = Math.exp(exponentValue); // e^2
        System.out.println("Exponencial: " + resultExp);

        // Máximo e Mínimo entre dois números
        double num3 = 8.5;
        double num4 = 4.2;
        double resultMax = Math.max(num3, num4); // Máximo entre 8.5 e 4.2
        double resultMin = Math.min(num3, num4); // Mínimo entre 8.5 e 4.2
        System.out.println("Máximo: " + resultMax);
        System.out.println("Mínimo: " + resultMin);

        // Gerando número aleatório entre 0 e 1
        double randomValue = Math.random(); // Valor aleatório entre 0.0 e 1.0
        System.out.println("Número Aleatório: " + randomValue);

        sc.close();
    }
}
