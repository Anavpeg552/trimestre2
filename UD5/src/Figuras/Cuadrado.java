package Figuras;

import Figuras.exceptions.LadoCuadradoNoValido;

public class Cuadrado extends FiguraGeometrica{

    private double lado;
    public Cuadrado(double lado, String nombre) throws LadoCuadradoNoValido {
        super(nombre);
        this.lado=lado;
    }

    @Override
    public int getLado() {
        return (int) lado;
    }

    public void setLado(double lado)throws LadoCuadradoNoValido {
        if(lado<=0){
            throw new LadoCuadradoNoValido();
        }

        this.lado = lado;
    }

    public void CalcularAreaCuadrado(){
        
    }
}
