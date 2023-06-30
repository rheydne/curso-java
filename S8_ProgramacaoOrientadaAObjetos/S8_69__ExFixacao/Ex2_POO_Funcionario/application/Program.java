package S8_ProgramacaoOrientadaAObjetos.S8_69__ExFixacao.Ex2_POO_Funcionario.application;

import java.util.Locale;
import java.util.Scanner;

import S8_ProgramacaoOrientadaAObjetos.S8_69__ExFixacao.Ex2_POO_Funcionario.entities.Employee;

public class Program {
    
    // Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
    // seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
    // salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
    // afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
    // projetada abaixo.

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.setName(sc.nextLine());
        System.out.print("Gross Salary: ");
        employee.setGrossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        employee.setTax(sc.nextDouble());

        System.out.printf("%nEmployee: %s%n%n", employee.toString());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.printf("%nUpdated data: %s", employee.toString());

        sc.close();
    }
}
