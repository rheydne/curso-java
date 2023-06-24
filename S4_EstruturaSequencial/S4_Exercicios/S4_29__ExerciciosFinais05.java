package S4_EstruturaSequencial.S4_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class S4_29__ExerciciosFinais05 {
    
    public static void main(String[] args) {
        
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1, numPeca1, peca2, numPeca2;
        double valUniPeca1, valUniPeca2, totalPedido;

        peca1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valUniPeca1 = sc.nextDouble();
        peca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valUniPeca2 = sc.nextDouble();

        totalPedido = (numPeca1 * valUniPeca1) + (numPeca2 * valUniPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", totalPedido);

        sc.close();
    }

}
