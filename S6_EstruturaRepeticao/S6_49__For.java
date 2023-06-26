package S6_EstruturaRepeticao;

import java.util.Scanner;

public class S6_49__For {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero, qtdNumeros;
        
        numero = 0;
        qtdNumeros = sc.nextInt();

        for(int i = 0; i < qtdNumeros; i++) {
            numero += sc.nextInt();
        }

        System.out.println(numero);

        sc.close();
    }
    
}
