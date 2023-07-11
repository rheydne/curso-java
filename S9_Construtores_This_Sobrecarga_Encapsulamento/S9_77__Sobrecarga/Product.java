package S9_Construtores_This_Sobrecarga_Encapsulamento.S9_77__Sobrecarga;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

    // sobrecarga das duas funcoes Product
    // significa que as duas tem o mesmo nome, mas atributos diferentes 
    // dessa forma o programa identifica qual funcao voce deseja acessar pelos atributos que voce vai fornecer
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
    }
}