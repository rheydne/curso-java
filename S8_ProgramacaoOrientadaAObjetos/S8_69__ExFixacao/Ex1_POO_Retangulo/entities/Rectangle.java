package S8_ProgramacaoOrientadaAObjetos.S8_69__ExFixacao.Ex1_POO_Retangulo.entities;

public class Rectangle {

    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle width(double width) {
        setWidth(width);
        return this;
    }

    public Rectangle height(double height) {
        setHeight(height);
        return this;
    }
    
    public double area () {
        return height * width;
    }
    
    public double perimeter () {
        return 2 * (height + width);
    }
    
    public double diagonal () {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}
