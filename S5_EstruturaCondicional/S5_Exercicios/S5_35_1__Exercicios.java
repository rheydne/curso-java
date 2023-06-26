package S5_EstruturaCondicional.S5_Exercicios;

import java.util.Scanner;

public class S5_35_1__Exercicios {
    
    public static void main(String[] args) {
        
        //  Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner sc = new Scanner(System.in);
        
        int x;

        x = sc.nextInt();

        if(x < 0)
            System.out.println("Negativo");
        else 
            System.out.println("Não Negativo");

        sc.close();
    }
}
