package Figuras;

import java.util.Scanner;

public class FiguraMain {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x = 0;

        while(x!=-1) {

            System.out.println("1. Crear Circulo");
            System.out.println("2. Crear Triangulo Equilatero");
            System.out.println("3. Crear Cuadrado");

            System.out.println("6. Salir");

            x = s.nextInt();

            switch (x) {
                case 1:
                    Circulo c1 =new Circulo(1,"c1");
                    break;
                case 2:
                    Cuadrado cd1=new Cuadrado(2,"cd1");
                    break;
                case 3:
                    //TrianguloEquilatero t1=new TrianguloEquilatero"(""");
            }
        }
    }
}
