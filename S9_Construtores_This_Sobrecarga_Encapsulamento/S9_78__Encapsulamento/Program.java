package S9_Construtores_This_Sobrecarga_Encapsulamento.S9_78__Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        // Fazer um programa para ler os dados de um produto em estoque (nome, preço e
        // quantidade no estoque). Em seguida:
        // • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
        // estoque)
        // • Realizar uma entrada no estoque e mostrar novamente os dados do produto
        // • Realizar uma saída no estoque e mostrar novamente os dados do produto

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Produto: ");
        String name = sc.nextLine();
        System.out.print("Valor: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.printf("%nProduct Data: %s%n%n", product.toString());

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.printf("%nUpdated Data: %s%n%n", product.toString());

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.printf("%nUpdated Data: %s", product.toString()); 

        sc.close();
    }
}