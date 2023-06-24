package S4_EstruturaSequencial.S4_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class S4_29__ExerciciosFinais02 {
    
    public static void main(String[] agrs) {
        
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
        // casas decimais conforme exemplos.
        // Fórmula da área: area = π . raio2
        // Considere o valor de π = 3.14159

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi;

        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);

        sc.close();
    }

}
