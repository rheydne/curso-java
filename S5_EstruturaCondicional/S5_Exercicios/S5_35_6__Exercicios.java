package S5_EstruturaCondicional.S5_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class S5_35_6__Exercicios {
    
    public static void main(String[] args) {
        
        // Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
        // seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
        // nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double valor;
        String resposta;

        valor = sc.nextDouble();
        resposta = "";

        if (valor < 0)
            resposta = "Fora de intervalo";
        else if (valor <= 25)
            resposta = "Intervalo [0,25]";
        else if (valor <= 50)
            resposta = "Intervalo (25,50]";
        else if (valor <= 75)
            resposta = "Intervalo (50,75]";
        else if (valor <= 100)
            resposta = "Intervalo (75,100]";
        
        System.out.println(resposta);

        sc.close();        
    }
}
