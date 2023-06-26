package S5_EstruturaCondicional.S5_Exercicios;

import java.util.Scanner;

public class S5_35_3__Exercicios {
    
    public static void main(String[] args) {
     
        // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        // Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        // ordem crescente ou decrescente.

        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0 || y % x == 0)
            System.out.println("São Múltiplos");
        else 
            System.out.println("Não São Múltiplos");
    
        sc.close();
    }
}
