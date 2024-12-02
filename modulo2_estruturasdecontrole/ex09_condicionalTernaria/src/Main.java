//Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
//condição.

//Sintaxe:
// ( condição ) ? valor_se_verdadeiro : valor_se_falso
//      ( 2 > 4 ) ? 50 : 80
// Exemplos:
// ( 2 > 4 ) ? 50 : 80 ---> 80
// ( 10 != 3 ) ? "Maria" : "Alex" ---> "Maria"

public class Main {
    public static void main(String[] args) {

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println ("preco antes: " + preco);
        System.out.println ("desconto aplicado: " + desconto);



        double preco2 = 10;
        double desconto2;
        if (preco2 < 20.0) {
            desconto2 = preco2 * 0.1;
        }
        else {
            desconto2 = preco2 * 0.05;
        }
        System.out.println ("preço antes: " + preco2);
        System.out.println ("desconto aplicado: " + desconto2);
    }
}