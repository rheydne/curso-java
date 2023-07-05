package S8_ProgramacaoOrientadaAObjetos.S8_70__MembrosEstaticos.S8_70__V2MembrosEstaticos.application;

import java.util.Locale;
import java.util.Scanner;

import S8_ProgramacaoOrientadaAObjetos.S8_70__MembrosEstaticos.S8_70__V2MembrosEstaticos.util.Calculator;

public class Program {
    public static void main(String[] args) {

        // Exemplo da classe sendo instanciada, sem a utilização de membros estaticos
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        double radius, c, v;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        c = calc.circumference(radius);
        
        v = calc.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }
}
