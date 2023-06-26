package S6_EstruturaRepeticao;

import java.util.Scanner;

public class S6_44__While {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int valor, somaValor;
        valor = sc.nextInt();
        somaValor = valor;

        while (valor != 0) {
            somaValor += valor;
            valor = sc.nextInt();
        }

        System.out.println("Soma dos valores digitados: "+ somaValor);

        sc.close();
    }
}
