public class Product {
    public String name; // Nome do produto.
    public double price; // Preço do produto.
    public int quantity; // Quantidade em estoque.

    // Método que calcula o valor total dos produtos em estoque.
    public double totalValueinStock() {
        return price * quantity; // Retorna o valor total com base no preço e quantidade.
    }

    // Método para adicionar produtos ao estoque.
    public void addProducts(int quantity) {
        this.quantity += quantity; // Atualiza o estoque somando a quantidade recebida.
        // O uso de 'this.quantity' diferencia o atributo da classe do parâmetro do método.
    }

    // Método para remover produtos do estoque.
    public void removeProducts(int quantity) {
        this.quantity -= quantity; // Atualiza o estoque subtraindo a quantidade recebida.
    }

    // Sobrescrita do método toString() para exibir os dados do produto.
    @Override
    public String toString() {
        // Retorna uma String formatada com o nome, preço, quantidade e valor total em estoque.
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity
                + " units, Total: $ " + String.format("%.2f", totalValueinStock());
    }
}
