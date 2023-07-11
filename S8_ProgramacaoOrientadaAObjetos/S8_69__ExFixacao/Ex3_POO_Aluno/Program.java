package S8_ProgramacaoOrientadaAObjetos.S8_69__ExFixacao.Ex3_POO_Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    // Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
    // (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
    // ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
    // para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
    // resolver este problema.

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.setName(sc.nextLine());
        student.sumGrade(sc.nextDouble());
        student.sumGrade(sc.nextDouble());
        student.sumGrade(sc.nextDouble());

        System.out.println(student.finalGrade());
        System.out.println(student.passOrNotPass());

        sc.close();
    }
}
