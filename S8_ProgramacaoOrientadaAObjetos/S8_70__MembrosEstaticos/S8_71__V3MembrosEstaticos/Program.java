package S8_ProgramacaoOrientadaAObjetos.S8_70__MembrosEstaticos.S8_71__V3MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Exemplo da classe sendo instanciada, sem a utilização de membros estaticos
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius, c, v;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        c = Calculator.circumference(radius);
        
        v = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
