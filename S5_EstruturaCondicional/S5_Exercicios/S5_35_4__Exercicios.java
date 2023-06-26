package S5_EstruturaCondicional.S5_Exercicios;

import java.util.Scanner;

public class S5_35_4__Exercicios {
    
    public static void main(String[] args) {
        
        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        // começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner sc = new Scanner(System.in);

        int x, y, horas;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y || x == y)
            horas = (24 - x) + y;
        else
            horas = y - x;

        System.out.printf("O JOGO DUROU %d HORA(S)", horas);

        sc.close();
    }
}
