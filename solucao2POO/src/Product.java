


public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueinStock (){
    return price * quantity;
    }

    public void addProducts (int quantity){
    this.quantity += quantity; //quando se usa o this.quantity vc ta se referenciando ao ATRIBUTO da classe e nao ao parametro que chega na funcao
    }

    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }



}
