package S8_ProgramacaoOrientadaAObjetos.S8_70__MembrosEstaticos.S8_70__V2MembrosEstaticos.util;

public class Calculator {

    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2 * PI * radius;
    }

    public double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3;
    }
}
