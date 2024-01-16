package Herencia;

public class HerenciaMain {
    public static void main(String[] args){

        Persona  p = new Persona("Luis", "López");

        p.entrar();
        p.salir();

        Estudiante e1= new Estudiante(12345,"1 DAM","Mario","Gomez");

        e1.entrar();
        e1.estudiar();

        DocenteFP dfp=new DocenteFP("Jose", "Molina");
        Docente d=dfp;
        Persona p1=dfp;

        Persona p2= new Docente("Maria", "Perez");
        Docente d1 = (Docente) p2;

        Docente d2=dfp;


        Persona p3 =new DocenteFP("Antonio","Ramirez");
        p3.salir();
        System.out.println(e1 instanceof Persona);
        System.out.println(e1 instanceof Estudiante);
        System.out.println(p3 instanceof DocenteFP);
        System.out.println(p3 instanceof Estudiante);

        if(p3 instanceof Estudiante){
            Estudiante e3 =(Estudiante) p3;
            e3.estudiar();
        }

        EstudianteESOBach ee1=new EstudianteESOBach(2652552,"A","Álvaro","Navarro Pegalajar");


   }
}
