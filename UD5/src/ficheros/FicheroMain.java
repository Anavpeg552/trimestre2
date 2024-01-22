package ficheros;

import java.sql.Array;
import java.util.ArrayList;

public class FicheroMain {
    public static void main(String[] args) {


        Imagen i1 = new Imagen(20, 40);
        DocumentoTexto f1 = new DocumentoTexto("fjafakfajfajfka");

        i1.guardar("foto.png");
        i1.recuperar("foto.png");

        f1.guardar("poema.txt");
        f1.recuperar("poema.txt");
}}