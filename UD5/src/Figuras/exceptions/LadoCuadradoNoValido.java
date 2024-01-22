package Figuras.exceptions;

public class LadoCuadradoNoValido extends IllegalArgumentException{
    public LadoCuadradoNoValido(){
        this("El lado del cuadrado no es válido");
    }
    public LadoCuadradoNoValido(String message){
        super(message);
    }
}
