package S5_EstruturaCondicional;

import java.util.Scanner;

public class S5_38__SwitchCase {
    
    public static void main(String[] args) {
        
        // Fazer um programa para ler um valor inteiro de 1 a 7 representando um 
        // dia da semana (sendo 1=domingo, 2=segunda, e assim por diante). 
        // Escrever na tela o dia da semana correspondente, conforme exemplos.

        Scanner sc = new Scanner(System.in);

        int numDia;
        String respostaDia;

        numDia = sc.nextInt();

        switch (numDia){
            case 1:
                respostaDia = "Domingo";
                break;
            case 2:
                respostaDia = "Segunda-Feira";
                break;
            case 3:
                respostaDia = "Terça-Feira";
                break;
            case 4:
                respostaDia = "Quarta-Feira";
                break;
            case 5:
                respostaDia = "Quinta-Feira";
                break;
            case 6:
                respostaDia = "Sexta-Feira";
                break;
            case 7:
                respostaDia = "Sábado";
                break;
            default:
                respostaDia = "Dia inválido";
                break;
        }

        System.out.println("Dia da semana: "+ respostaDia);
        sc.close();
    }
}
