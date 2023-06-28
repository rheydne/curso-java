package S8_ProgramacaoOrientadaAObjetos;

import java.util.Locale;
import java.util.Scanner;

public class S8_63__ProbSemOrientacaoObjeto {
    
    public static void main(String[] args) {
        
        // Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
        // válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
        // possui a maior área.
        // A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
        // seguinte (fórmula de Heron)

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double t1m1, t1m2, t1m3, t2m1, t2m2, t2m3, areat1, areat2, p;

        System.out.println("Enter the measures of triangle X:");
        t1m1 = sc.nextDouble();
        t1m2 = sc.nextDouble();
        t1m3 = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        t2m1 = sc.nextDouble();
        t2m2 = sc.nextDouble();
        t2m3 = sc.nextDouble();

        p = (t1m1 + t1m2 + t1m3) / 2;
        areat1 = Math.sqrt((p * (p - t1m1) * (p - t1m2) * (p - t1m3)));

        System.out.printf("Triangle X area: %.4f%n", areat1);

        p = (t2m1 + t2m2 + t2m3) / 2;
        areat2 = Math.sqrt((p * (p - t2m1) * (p - t2m2) * (p - t2m3)));

        System.out.printf("Triangle Y area: %.4f%n", areat2);

        if (areat1 > areat2) 
            System.out.println("Larger area: X");
        else 
            System.out.println("Larger area: Y");
    
        sc.close();
    }
}
