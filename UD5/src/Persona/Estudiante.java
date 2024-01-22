package Persona;

import Herencia.Persona;

public class Estudiante extends Persona {
    private int nie;
    private String grupo;

    public Estudiante(int nie, String grupo, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.nie = nie;
        this.grupo = grupo;
    }

    public void estudiar(){
        System.out.println(getNombre()+" estudia en "+ grupo);
    }


}
