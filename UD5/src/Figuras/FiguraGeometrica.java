package Figuras;public class FiguraGeometrica {

    private int lado;
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.lado = lado;
        this.nombre = nombre;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException{
        if(nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }
        this.nombre = nombre;
    }


}
