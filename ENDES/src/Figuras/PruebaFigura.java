package Figuras;

import java.awt.*;
import java.util.Scanner;

public class PruebaFigura {

    public static void main(String[] args) {
        int opcion;
        Scanner teclado =new Scanner(System.in);
        do{
            opcion = mostrarMenu();
            if(opcion != 4){
                System.out.print("Intr");
                double x=teclado.nextDouble();
                System.out.print("Intr");
                double y=teclado.nextDouble();


            switch (opcion){
                case 1:
                    System.out.print("l1");
                    double lado1= teclado.nextDouble();
                    System.out.print("l2");
                    double lado2= teclado.nextDouble();
                    System.out.print("l3");
                    double lado3= teclado.nextDouble();
                    Triangulo t=new Triangulo(x,y, Color.blue, lado1,lado2,lado3);
                    System.out.print(t.perimetro());
                    System.out.print(t.area());
                            break;
                case 2:
                    System.out.print("");
                    double base=teclado.nextDouble();
                    System.out.print("");
                    double altura = teclado.nextDouble();
                    Rectangulo r=new Rectangulo(x,y,Color.blue,base,altura);
                    System.out.print(r.area());
                    System.out.print(r.perimetro());
                    break;
                case 3:
                    System.out.print("Introduzca");
                    double lado=teclado.nextDouble();
                    Cuadrado c=new Cuadrado(x,y,Color.blue,lado);
                    System.out.print(c.perimetro());
                    System.out.print(c.area());
                    break;
            }
            }
        }while(opcion!=4);
        teclado.close();
    }

    public static int mostrarMenu(){
        int opcion;
        System.out.print("1) Triangulo");
        System.out.print("2) Rectangulo");
        System.out.print("3) Cuadrado");
        System.out.print("4) Salir");
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print(("Intr (1-4): "));
            opcion = teclado.nextInt();
            if(opcion<1 || opcion >4)
                System.out.println("Debe ... ");

        }while (opcion<1 || opcion>4);
            return opcion;
    }
}
