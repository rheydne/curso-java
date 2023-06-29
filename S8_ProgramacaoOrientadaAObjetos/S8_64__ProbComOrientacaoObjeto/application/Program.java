package S8_ProgramacaoOrientadaAObjetos.S8_64__ProbComOrientacaoObjeto.application;

import java.util.Locale;
import java.util.Scanner;

import S8_ProgramacaoOrientadaAObjetos.S8_64__ProbComOrientacaoObjeto.entities.Triangle;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area1, area2;
        Triangle x, y, triangle;

        x = new Triangle();
        y = new Triangle();
        triangle = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        area1 = x.CalculoArea();
        area2 = y.CalculoArea();

        System.out.printf("Triangle X area: %.4f%n", area1);
        System.out.printf("Triangle Y area: %.4f%n", area2);

        System.out.println("Larger area: " + triangle.MaiorTriangulo(area1, area2));
        
        sc.close();
    }
}
