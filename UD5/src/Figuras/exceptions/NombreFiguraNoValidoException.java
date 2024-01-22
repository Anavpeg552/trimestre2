package Figuras.exceptions;

public class NombreFiguraNoValidoException extends IllegalArgumentException{

    public NombreFiguraNoValidoException(){
        this("El nombre de la figura no es válida");
    }
    public NombreFiguraNoValidoException(String message){
        super(message);
    }
}
