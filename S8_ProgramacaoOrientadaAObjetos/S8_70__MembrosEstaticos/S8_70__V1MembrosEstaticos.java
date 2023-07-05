package S8_ProgramacaoOrientadaAObjetos.S8_70__MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class S8_70__V1MembrosEstaticos {
    
    public static final double PI = 3.14159; // modo de declarar um valor constante (usar o final e o padrao é com nomes todos maiusculos)
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius, c, v;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        c = circumference(radius);
        
        v = volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3;
    }
}
