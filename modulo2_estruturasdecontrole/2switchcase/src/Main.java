// Estrutura Switch-Case para Seleção de Dia da Semana

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria uma instância do Scanner para ler entradas do teclado

        int x = sc.nextInt(); // Lê um número inteiro que representa o dia da semana (1 a 7)
        String dia; // Variável para armazenar o nome do dia

        // A estrutura switch-case compara o valor de 'x' com os casos definidos (1 a 7)
        switch (x) {
            case 1: // Se 'x' for 1
                dia = "domingo"; // A variável 'dia' recebe o valor "domingo"
                break; // Interrompe o switch após a correspondência do caso
            case 2: // Se 'x' for 2
                dia = "segunda"; // A variável 'dia' recebe o valor "segunda"
                break;
            case 3: // Se 'x' for 3
                dia = "terca"; // A variável 'dia' recebe o valor "terca"
                break;
            case 4: // Se 'x' for 4
                dia = "quarta"; // A variável 'dia' recebe o valor "quarta"
                break;
            case 5: // Se 'x' for 5
                dia = "quinta"; // A variável 'dia' recebe o valor "quinta"
                break;
            case 6: // Se 'x' for 6
                dia = "sexta"; // A variável 'dia' recebe o valor "sexta"
                break;
            case 7: // Se 'x' for 7
                dia = "sabado"; // A variável 'dia' recebe o valor "sabado"
                break;
            default: // Se 'x' não corresponder a nenhum valor entre 1 e 7
                dia = "valor invalido"; // A variável 'dia' recebe o valor "valor invalido"
                break; // Interrompe o switch após a execução do 'default'
        }

        System.out.println("Dia da semana: " + dia); // Exibe o dia correspondente ou a mensagem de erro
        sc.close(); // Fecha o scanner após o uso
    }
}
