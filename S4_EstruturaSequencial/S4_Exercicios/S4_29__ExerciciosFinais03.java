package S4_EstruturaSequencial.S4_Exercicios;

import java.util.Scanner;

public class S4_29__ExerciciosFinais03 {
    
    public static void main(String[] args) {
        
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
        // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }

}
