package S4_EstruturaSequencial;

import java.util.Locale;

public class S4_23_1SaidaDeDados {
    
    public static void main (String[] args) {
        
        int y = 32;
        double x = 10.75536;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.print("Bom dia!");
        System.out.println("Bom dia!");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x); // mascara para 2 casas decimais
        System.out.printf("%.4f%n", x); // mascara para 4 casas decimais

        Locale.setDefault(Locale.US); // trocar o separador de casas decimais de "," para "."
        System.out.printf("%.4f%n", x); 

        System.out.println("Resultado = " + x + " metros"); // Concatenação 
        System.out.printf("Resultado = %.2f metros%n", x); // Concatenação com float

        // Concatenação com diversas variáveis
        // %f = ponto flutuante; %d = inteiro; %s = texto; %n = quebra de linha
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }   
}
