package ficheros;

public class DocumentoTexto extends Almacenamiento{


    public DocumentoTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void guardar(String nombreFichero) {
        System.out.println("Guardando documento en "+nombreFichero);
    }

    @Override
    public void recuperar(String nombreFichero) {
        System.out.println("Cargando documento desde "+nombreFichero);
    }

    private String texto="contenido";

}
