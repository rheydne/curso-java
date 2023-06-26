package S5_EstruturaCondicional.S5_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class S5_35_5__Exercicios {
    
    public static void main(String[] args) {
        
        // Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
        // seguir, calcule e mostre o valor da conta a pagar.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codItem, qtd;

        double x1, x2, x3, x4, x5, valorTotal;

        x1 = 4.0;
        x2 = 4.5;
        x3 = 5;
        x4 = 2;
        x5 = 1.5;

        codItem = sc.nextInt();
        qtd = sc.nextInt();

        if (codItem == 1)
            valorTotal = x1 * qtd;
        else if (codItem == 2)
            valorTotal = x2 * qtd;
        else if (codItem == 3)
            valorTotal = x3 * qtd;
        else if (codItem == 4)
            valorTotal = x4 * qtd;
        else
            valorTotal = x5 * qtd;

        System.out.printf("Total: R$ %.2f", valorTotal);

        sc.close();

    }

}
