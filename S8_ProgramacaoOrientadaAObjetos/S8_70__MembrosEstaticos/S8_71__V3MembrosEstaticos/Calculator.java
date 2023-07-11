package S8_ProgramacaoOrientadaAObjetos.S8_70__MembrosEstaticos.S8_71__V3MembrosEstaticos;

public class Calculator {

    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3;
    }
}
