
public class triangle { // nome da classe
    public double a; //atributos da classe
    public double b; //atributos da classe
    public double c; //atributos da classe

    //o prefixo public indica que o atributo ou metodo pode ser usado em outros arquivos e double e o tipo de dado que o metodo retorna.
                  // area é nome do metodo e () lista de parametros do metodo
    public double area() { // o prefixo public
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}