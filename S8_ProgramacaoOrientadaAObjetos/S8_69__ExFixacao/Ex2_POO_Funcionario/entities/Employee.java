package S8_ProgramacaoOrientadaAObjetos.S8_69__ExFixacao.Ex2_POO_Funcionario.entities;

public class Employee {
    
    private String name;
    private double grossSalary;
    private double tax;


    public Employee() {
    }

    public Employee(String name, double glossSalary, double tax) {
        this.name = name;
        this.grossSalary = glossSalary;
        this.tax = tax;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return this.grossSalary;
    }

    public void setGrossSalary(double glossSalary) {
        this.grossSalary = glossSalary;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Employee name(String name) {
        setName(name);
        return this;
    }

    public Employee glossSalary(double glossSalary) {
        setGrossSalary(glossSalary);
        return this;
    }

    public Employee tax(double tax) {
        setTax(tax);
        return this;
    }
    
    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return name 
            + ", $ "
            + netSalary();
    }
}
