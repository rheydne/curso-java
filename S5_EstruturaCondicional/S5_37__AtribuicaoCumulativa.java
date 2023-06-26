package S5_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class S5_37__AtribuicaoCumulativa {
    
    public static void main(String[] args) {
        
        // Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
        // dá direito a 100 minutos de telefone. Cada minuto que exceder a
        // franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
        // quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
        // a ser pago.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double minutosConsumidos, minutosPlano, valorFatura;
        minutosPlano = 100;
        valorFatura = 50;

        minutosConsumidos = sc.nextDouble();

        if (minutosConsumidos > 100)
            valorFatura += (minutosConsumidos - minutosPlano) * 2;

        System.out.printf("Valor a pagar: R$ %.2f", valorFatura);    

        sc.close();
    }
}
