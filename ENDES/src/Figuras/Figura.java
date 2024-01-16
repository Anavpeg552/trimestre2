package Figuras;
import java.awt.Color;
public abstract class Figura {
    private Punto centro;
    private Color color;

    public Figura(double x, double y, Color color){
        centro =new Punto(x, y);
        this.color = color;
    }


    public double getYCentro(){
        return centro.getY();
    }


    public Color getColor() {
        return color;
    }

    public double getXCentro(){
        return centro.getX();
    }


    public void setXCentro(double x) {
        this.centro = centro;
    }

    public void setYCentro(Punto centro) {
        this.centro = centro;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double perimetro();
    public abstract double area();




    public int esMayorQue(Figura otraFigura){
        if(this.area()>otraFigura.area()){
            return 1;
        }else{
            if(this.area()< otraFigura.area()){
                return -1;
            }else{
                return 0;
            }
        }
    }


}
