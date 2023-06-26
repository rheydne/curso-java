package S6_EstruturaRepeticao;

import java.util.Scanner;

public class S6_54__ForWhile {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double ceusius, fahrenheit;
        char resposta;

        do {

            System.out.print("Digite a temperatura em Celsius: ");
            ceusius = sc.nextDouble();

            fahrenheit = (9 * ceusius / 5) + 32;

            System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrenheit);

            System.out.print("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);

        } while ( resposta != 'n');

        sc.close();
    }
}
