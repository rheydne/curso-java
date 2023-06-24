package S4_EstruturaSequencial.S4_Exercicios;

import java.util.Scanner;

public class S4_29__ExerciciosFinais01 {
    
    public static void main(String[] args) {

        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
        // mensagem explicativa, conforme exemplos

        Scanner sc = new Scanner(System.in);

        int a, b, result;

        a = sc.nextInt();
        b = sc.nextInt();

        result = a + b;

        System.out.println("SOMA = " + result);

        sc.close();        
    }

}
