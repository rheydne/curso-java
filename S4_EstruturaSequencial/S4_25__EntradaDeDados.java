package S4_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class S4_25__EntradaDeDados {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Como ler strings
        String x;
        x = sc.next();
        System.out.println("Você digitou " + x);

        // Como ler inteiros
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou " + y);

        // Como ler decimais
        double z;
        z = sc.nextDouble();
        System.out.printf("Você digitou %.2f%n", z);

        // Como ler char
        char a;
        a = sc.next().charAt(0);
        System.out.printf("Você digitou %s%n", a);        

        sc.close();
    }
}
