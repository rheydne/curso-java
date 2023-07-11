package S8_ProgramacaoOrientadaAObjetos.S8_70__MembrosEstaticos.S8_72__ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        // Faca um programa para ler a cotacao do dolar, e depois um valor em dolares para
        // ser comprado por uma pessoa em reais. Informar quantos reais vai pagar pelos
        // dolares, considerando ainda que a pessoa tera de pagar 6% de IOF sobre o valor
        // em dolar

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double currentQuote, buyDollar;

        System.out.print("What is the dolar price: ");
        currentQuote = sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        buyDollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", Dolar.CurrencyConverter(currentQuote, buyDollar));
        
        sc.close();
    }
}
