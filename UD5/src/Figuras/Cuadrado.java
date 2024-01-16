package Figuras;

public class Cuadrado extends FiguraGeometrica{

    private double lado;
    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado=lado;
    }

    @Override
    public int getLado() {
        return (int) lado;
    }

    public void CalcularAreaCuadrado(){
        
    }
}
