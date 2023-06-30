package S8_ProgramacaoOrientadaAObjetos.S8_69__ExFixacao.Ex3_POO_Aluno.entities;

public class Student {
    
    private String name;
    private double grade;

    public Student() {
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student grade(double grade) {
        setGrade(grade);
        return this;
    }    

    public void sumGrade(double grade) {
        this.grade += grade;
    }

    public String passOrNot() {
        if(grade >= 60) {
            return "PASS";
        }
        else {
            return "FAILED\n"
                + "MISSING "
                + String.format("%.2f", (60 - getGrade()))
                + " POINTS";
        }
    }
}
