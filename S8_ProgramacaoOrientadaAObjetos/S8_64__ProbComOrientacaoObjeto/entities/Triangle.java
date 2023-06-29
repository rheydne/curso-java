package S8_ProgramacaoOrientadaAObjetos.S8_64__ProbComOrientacaoObjeto.entities;

public class Triangle {
    
    public double a;
    public double b;
    public double c;

    public double CalculoArea() {
        double p = (a + b + c) / 2;
        double area = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        return area;
    }

    public char MaiorTriangulo(double a, double b) {
        if (a > b)
            return 'X';
        else
            return 'Y';        
    }
}
