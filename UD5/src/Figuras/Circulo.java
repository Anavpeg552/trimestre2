package Figuras;

public class Circulo extends FiguraGeometrica{
    public Circulo(int lado, String nombre) {
        super(nombre);
    }

    public void CalcularAreaCirculo(){
        double a = 0;
        a= Math.PI*Math.pow(getLado(),2);
    }
}
