package S8_ProgramacaoOrientadaAObjetos.S8_66__POO_toString.application;

import java.util.Locale;
import java.util.Scanner;

import S8_ProgramacaoOrientadaAObjetos.S8_66__POO_toString.entities.Product;

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

        Product product = new Product();

        System.out.print("Produto: ");
        product.setName(sc.nextLine());
        System.out.print("Valor: ");
        product.setPrice(sc.nextDouble());
        System.out.print("Quantidade: ");
        product.setQuantity(sc.nextInt());

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
