package Reloj;

public class RelojMain {
    public static void main(String[] args) {

        Reloj r1 = new Reloj(2, 23, 58);
        r1.incrementarSegundos();
        r1.incrementarSegundos(3);
        System.out.println(r1);

        RelojBinario r2 = new RelojBinario(2,23,58);
        System.out.println(r2);

        RelojCalendario r3 = new RelojCalendario(1,2,2003);
        System.out.println(r3);

    }
}
