package Figuras;

public class TrianguloEquilatero extends  FiguraGeometrica{
    public TrianguloEquilatero(int lado, String nombre) {
        super(nombre);
    }


    public void CalcularAreaTriangulo(){
        double a = 0;
        a= getLado()*((getLado()*Math.sqrt(3))/2)/2;
    }
}
