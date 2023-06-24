package S4_EstruturaSequencial.S4_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class S4_29__ExerciciosFinais04 {
    
    public static void main(String[] args) {

        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
        // decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numFunc, horTrab, salHor, salTotal;

        numFunc = sc.nextDouble();
        horTrab = sc.nextDouble();
        salHor = sc.nextDouble();

        salTotal = horTrab * salHor;

        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f", salTotal);

        sc.close();
    }
    
}
