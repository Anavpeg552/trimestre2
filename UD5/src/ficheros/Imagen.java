package ficheros;

public class Imagen extends Almacenamiento implements Rotable{

    private int anchura;
    private int altura;

    public Imagen(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void guardar(String nombreFichero) {
        System.out.println("Guardando imagen en "+nombreFichero);
    }

    @Override
    public void recuperar(String nombreFichero) {
        System.out.println("Cargando imagen desde "+nombreFichero);
    }


    @Override
    public void rotarSentidoAgujas() {
        System.out.print("Girar+90");
    }

    @Override
    public void rotarSentidoContrarioAgujas() {
        System.out.print("Girar+90");
    }



}
